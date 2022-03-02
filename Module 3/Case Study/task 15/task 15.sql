USE furama_resort;

SELECT 
    nhan_vien.ma_nhan_vien,
    nhan_vien.ho_ten,
    trinh_do.ten_trinh_do,
    bo_phan.ten_bo_phan,
    nhan_vien.so_dien_thoai,
    nhan_vien.dia_chi
FROM
    nhan_vien
        LEFT JOIN
    trinh_do ON nhan_vien.ma_trinh_do = trinh_do.ma_trinh_do
        LEFT JOIN
    bo_phan ON nhan_vien.ma_bo_phan = bo_phan.ma_bo_phan
        LEFT JOIN
    hop_dong ON nhan_vien.ma_nhan_vien = hop_dong.ma_nhan_vien
WHERE
    hop_dong.ngay_lam_hop_dong BETWEEN '2020-01-01' AND '2021-12-31'
GROUP BY hop_dong.ma_nhan_vien
HAVING COUNT(hop_dong.ma_hop_dong) <= 3
ORDER BY hop_dong.ma_nhan_vien ASC;