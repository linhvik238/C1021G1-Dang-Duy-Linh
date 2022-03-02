use quan_ly_sinh_vien;

select student.*, avg(mark) from student
left join mark on student.student_id = mark.student_id
group by student.student_id
order by avg(mark) desc;
