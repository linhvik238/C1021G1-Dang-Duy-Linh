use quan_ly_sinh_vien;

select * from student;

select * from student where `status` = true;

select * from `subject` where credit < 10;

select S.student_id, S.student_name, C.class_name
from student S join class C on S.class_id = C.class_id;

select S.student_id, S.student_name, C.class_name
from student S join class C on S.class_id = C.class_id
where C.class_name = 'C10';

select S.student_id, S.student_name, Sub.sub_name, M.mark
from student S join mark M on S.student_id = M.student_id join `subject` Sub on M.sub_id = Sub.sub_id;

select S.student_id, S.student_name, Sub.sub_name, M.mark
from Student S join mark M on S.student_id = M.student_id join `subject` Sub on M.sub_id = Sub.sub_id
where Sub.sub_name = 'CF';