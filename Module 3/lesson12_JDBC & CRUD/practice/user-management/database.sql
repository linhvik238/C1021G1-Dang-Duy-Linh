create database demo;
use demo;

create table users (
id int(3) not null auto_increment,
`name` varchar(120) not null,
email varchar(220) not null,
country varchar(120),
primary key (id)
);

insert into users (`name`, email, country) values 
('Linh', 'linh@codegym.vn', 'Viet Nam'),
('Hoang', 'hoang@codegym.vn', 'Viet Nam'),
('Thuan', 'thuan@codegym.vn', 'Viet Nam'),
('Dat', 'dat@codegym.vn', 'Viet Nam'),
('Hieu', 'hieu@codegym.vn', 'Viet Nam');