use furama_resort;

select month(ngay_lam_hop_dong) as '#thang', count(ma_khach_hang) as 'so_luong_khach_hang' from hop_dong
where ngay_lam_hop_dong like '2021%'
group by month(ngay_lam_hop_dong)
order by ngay_lam_hop_dong asc;