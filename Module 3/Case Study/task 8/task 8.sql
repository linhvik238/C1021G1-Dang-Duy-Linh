use furama_resort;
-- C1
-- SELECT ho_ten FROM khach_hang 
-- UNION
-- SELECT ho_ten FROM khach_hang;

-- C2
-- select distinct ho_ten from khach_hang;

-- C3
select ho_ten from khach_hang
group by ho_ten;


