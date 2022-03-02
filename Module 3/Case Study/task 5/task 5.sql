use furama_resort;

select khach_hang.ma_khach_hang, khach_hang.ho_ten, loai_khach.ten_loai_khach, 
case 
		when hop_dong.ma_hop_dong is null then '' 
        else hop_dong.ma_hop_dong
        end
        as 'ma_hop_dong',
case 
		when dich_vu.ten_dich_vu is null then ''
        else dich_vu.ten_dich_vu 
        end
        as 'ten_dich_vu',
case	
		when hop_dong.ngay_lam_hop_dong is null then ''
        else hop_dong.ngay_lam_hop_dong
        end
        as 'ngay_lam_hop_dong',
case		
		when hop_dong.ngay_ket_thuc is null then ''
        else hop_dong.ngay_ket_thuc
        end
        as 'ngay_ket_thuc',
case 
		when khach_hang.ma_khach_hang not in 
        (select khach_hang.ma_khach_hang from khach_hang inner join hop_dong on khach_hang.ma_khach_hang = hop_dong.ma_khach_hang)
        then 0
        when hop_dong_chi_tiet.so_luong is null then dich_vu.chi_phi_thue
        else sum(dich_vu.chi_phi_thue + hop_dong_chi_tiet.so_luong * dich_vu_di_kem.gia)
        end
		as 'tong_tien'

from  khach_hang 
left join loai_khach on khach_hang.ma_loai_khach = loai_khach.ma_loai_khach
left join hop_dong on khach_hang.ma_khach_hang = hop_dong.ma_khach_hang
left join dich_vu on hop_dong.ma_dich_vu = dich_vu.ma_dich_vu
left join hop_dong_chi_tiet on hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong
left join dich_vu_di_kem on hop_dong_chi_tiet.ma_dich_vu_di_kem = dich_vu_di_kem.ma_dich_vu_di_kem
group by hop_dong.ma_hop_dong, khach_hang.ma_khach_hang
order by (khach_hang.ma_khach_hang) asc, (hop_dong.ma_hop_dong) desc;

