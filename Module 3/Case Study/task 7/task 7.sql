use furama_resort;

SELECT 
    dich_vu.ma_dich_vu,
    dich_vu.ten_dich_vu,
    dich_vu.dien_tich,
    dich_vu.so_nguoi_toi_da,
    dich_vu.chi_phi_thue,
    loai_dich_vu.ten_loai_dich_vu
FROM
    dich_vu
        LEFT JOIN
    loai_dich_vu ON dich_vu.ma_loai_dich_vu = loai_dich_vu.ma_loai_dich_vu
        LEFT JOIN
    hop_dong ON dich_vu.ma_dich_vu = hop_dong.ma_dich_vu
WHERE
    dich_vu.ten_dich_vu NOT IN (SELECT 
            dich_vu.ten_dich_vu
        FROM
            dich_vu
                JOIN
            hop_dong ON dich_vu.ma_dich_vu = hop_dong.ma_dich_vu
        WHERE
            hop_dong.ngay_lam_hop_dong LIKE '2021%')
GROUP BY ma_dich_vu;