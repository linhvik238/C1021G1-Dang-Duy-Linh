use quan_ly_sinh_vien;

select student.* from student where student.student_name like 'h%';
-- select class.* from class where class.start_date like '____-12%';
select class.* from class where month(start_date) = 12;

select `subject`.* from `subject` where `subject`.credit between 3 and 5;

set SQL_safe_updates = 0;
update student set class_id = '2' where student_name = 'Hung';
set SQL_safe_updates = 1;

select student.student_id, student.student_name, `subject`.sub_name, mark.mark
from mark join student on student.student_id = mark.student_id 
join `subject` on `subject`.sub_id = mark.sub_id
order by mark DESC, student_name ASC; 