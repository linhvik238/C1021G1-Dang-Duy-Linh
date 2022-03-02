use furama_resort;

select khach_hang.ma_khach_hang, khach_hang.ho_ten, count(ma_hop_dong) as so_lan
from hop_dong 
inner join khach_hang on hop_dong.ma_khach_hang = khach_hang.ma_khach_hang
inner join loai_khach on khach_hang.ma_loai_khach = loai_khach.ma_loai_khach
where loai_khach.ma_loai_khach = '1'
group by ma_khach_hang
order by so_lan asc;