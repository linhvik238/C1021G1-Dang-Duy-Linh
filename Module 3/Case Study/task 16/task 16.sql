use furama_resort;

CREATE TEMPORARY TABLE temp
SELECT nhan_vien.ma_nhan_vien
from nhan_vien left join hop_dong
on nhan_vien.ma_nhan_vien = hop_dong.ma_nhan_vien where year(hop_dong.ngay_lam_hop_dong) between 2019 and 2021
group by nhan_vien.ma_nhan_vien
 having count(hop_dong.ma_hop_dong)<1;
SELECT * from temp;
DELETE from nhan_vien
where ma_nhan_vien in
(select * from temp);
DROP TEMPORARY TABLE temp;