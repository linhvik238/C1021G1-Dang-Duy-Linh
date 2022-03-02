use quan_ly_sinh_vien;

select `subject`.* from `subject`
inner join mark on `subject`.sub_id = mark.sub_id
where mark = (select max(mark) from mark);