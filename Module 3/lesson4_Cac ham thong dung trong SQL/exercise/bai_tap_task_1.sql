SELECT * FROM quan_ly_sinh_vien.subject;

select `subject`.* from `subject`
where credit = (select max(credit) from `subject`);