create database demo;

use demo; 

create table products(
id int primary key,
product_code varchar(50) not null,
product_name varchar(50),
product_price int,
product_amount int,
product_description varchar(50),
product_status BIT
);
insert into products 
values(1,"T1","trouser",400000,2,"for adults",b'1'),
(2,"S1","shirt",250000,4,"for adults",b'0'),
(3,"Sl1","sleeper",10000,3,"for adult and kid",b'1'),
(4,"B1","bag",7000,1,"for adult",b'0')
;

explain select * from products where product_code = "S1";
explain select * from products 
where product_name = "sleeper" and product_price = "10000" ;

create index code_index 
on products(product_code);

create index name_price_index 
on products(product_name,product_price);

explain select * from products where product_code = "B1";
explain select * from products 
where product_name = "bag" and product_price = "7000" ;

drop index code_index  on products;
drop index name_price_index  on products;

create view products_view as
select  product_code, product_name, product_price, product_status 
from products;

update products_view 
set product_price = 20000 
where product_code = "B1";

drop view products_view;
​
delimiter //
create procedure display_products_ps()
begin
select * from products;
end //
delimiter //
​
call display_products_ps();
​
delimiter //
create procedure add_product_ps(
id int,product_code varchar(50),
product_name varchar(50),
product_price int,
product_amount int,
product_description varchar(50),
product_status BIT)
begin
insert into products values(
id,product_code,product_name,product_price,product_amount,product_description,product_status);
end //
delimiter //
​
call add_product_ps(6,"Sh1","shoe",660000,4,"for adults",b'1');
​
​
delimiter //
create procedure delete_product_byid_ps(product_id int)
begin
delete from products where id = product_id;
end //
delimiter //

call delete_product_byid_ps(5);
