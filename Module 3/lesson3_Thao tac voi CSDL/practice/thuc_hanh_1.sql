use quan_ly_sinh_vien;

insert into class
values (1, 'C10', '1993-08-23', 1), (2, 'C11', '2003-12-23', 1), (3, 'C12', current_date, 0);

insert into student (student_name, address, phone, `status`, class_id) 
values ('Thuan', 'Quang Nam', '0903555888', 1, 1), ('Bao', 'Da Nang', '0905888555', 0, 2);

insert into student (student_name, address, `status`, class_id)
values ('Hoang', 'Binh Dinh', 1, 1);

insert into `subject`
values (1, 'CF', 5, 1),
	   (2, 'C', 6, 1),
       (3, 'HDJ', 5, 1),
       (4, 'RDBMS', 10, 1);
       
insert into mark (sub_id, student_id, mark, exam_times)
values (1, 1, 8, 1), 
	   (1, 2, 10, 2),
       (2, 1, 12, 1);

