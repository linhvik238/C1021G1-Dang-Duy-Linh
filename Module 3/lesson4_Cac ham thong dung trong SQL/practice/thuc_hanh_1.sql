use quan_ly_sinh_vien;

select address, count(student_id) as 'Số lượng học viên'
from student
group by address;

select S.student_id, S.student_name, AVG(mark)
from student S join mark M on S.student_id = M.student_id
group by S.student_id, S.student_name;

select S.student_id, S.student_name, AVG(mark)
from student S join mark M on S.student_id = M.student_id
group by S.student_id, S.student_name
having AVG(mark) > 15;

select S.student_id, S.student_name, AVG(mark)
from student S join mark M on S.student_id = M.student_id
group by S.student_id, S.student_name
having avg(mark) >= all (select avg(mark) from mark group by mark.student_id);