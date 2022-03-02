USE furama_resort;

SELECT 
    hop_dong.ma_hop_dong,
    nhan_vien.ho_ten,
    khach_hang.ho_ten,
    khach_hang.so_dien_thoai,
    dich_vu.ma_dich_vu, 
    dich_vu.ten_dich_vu,
    CASE
        WHEN SUM(so_luong) IS NULL THEN 0
        ELSE SUM(so_luong)
    END AS 'so_luong_dich_vu_di_kem',
    hop_dong.tien_dat_coc
FROM
    hop_dong
        LEFT JOIN
    hop_dong_chi_tiet ON hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong
        LEFT JOIN
    dich_vu ON hop_dong.ma_dich_vu = dich_vu.ma_dich_vu
        LEFT JOIN
    khach_hang ON hop_dong.ma_khach_hang = khach_hang.ma_khach_hang
        LEFT JOIN
    nhan_vien ON hop_dong.ma_nhan_vien = nhan_vien.ma_nhan_vien
WHERE
    hop_dong.ngay_lam_hop_dong BETWEEN '2020-10-01' AND '2020-12-31'
        AND hop_dong.ngay_lam_hop_dong NOT IN (SELECT hop_dong.ngay_lam_hop_dong NOT BETWEEN '2021-01-01' AND '2021-06-30')
GROUP BY hop_dong.ma_hop_dong;
