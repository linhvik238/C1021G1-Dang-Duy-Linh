create schema quan_ly_ban_hang;
use quan_ly_ban_hang;

create table customer(
customer_id int auto_increment primary key,
customer_name varchar(50) not null,
customer_age int default 0
);

create table `order`(
order_id int auto_increment primary key,
order_date date not null,
order_total_price double not null,
customer_id int,
foreign key (customer_id) references customer(customer_id)
);

create table product (
product_id int auto_increment primary key,
product_name varchar(50) not null,
product_price double not null
);

create table order_detail(
order_id int,
product_id int,
order_quantity int not null,
primary key (order_id, product_id),
foreign key (order_id) references `order`(order_id),
foreign key (product_id) references product(product_id)
);


