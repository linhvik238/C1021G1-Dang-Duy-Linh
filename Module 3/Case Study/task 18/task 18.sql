create temporary table temp
select khach_hang.* from khach_hang join hop_dong on khach_hang.ma_khach_hang = hop_dong.ma_khach_hang
where hop_dong.ngay_lam_hop_dong < '2021-01-01'; 
SET FOREIGN_KEY_CHECKS=OFF;
delete from khach_hang where khach_hang.ma_khach_hang in (select temp.ma_khach_hang from temp);
SET FOREIGN_KEY_CHECKS=ON;
select * from temp;

drop table temp;
