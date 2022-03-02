use quan_ly_ban_hang;

insert into customer (customer_name, customer_age) values
('Minh Quan', 10), ('Ngoc Oanh', 20), ('Hong Ha', 50);

insert into `order` (customer_id, order_date, order_total_price) values
('1', '2006-03-21', null), ('2', '2006-03-23', null), ('1', '2006-03-16', null);

insert into product (product_name, product_price) values
('May Giat', 3), ('Tu Lanh', 5), ('Dieu Hoa', 7), ('Quat', 1), ('Bep Dien', 2);

insert into order_detail (order_id, product_id, order_quantity) values
(1, 1, 3), (1, 3, 7), (1, 4, 2), (2, 1, 1), (3, 1, 8), (2, 5, 4), (2, 3, 3);

select order_id, order_date, order_total_price from `order`;

select customer.customer_name, product.product_name 
from customer inner join `order` on customer.customer_id = `order`.customer_id
inner join order_detail on `order`.order_id = order_detail.order_id
inner join product on order_detail.product_id = product.product_id;

select customer.customer_name 
from customer left join `order` on customer.customer_id = `order`.customer_id
left join order_detail on `order`.order_id = order_detail.order_id
left join product on order_detail.product_id = product.product_id 
where order_detail.order_quantity is null;

select `order`.order_id, `order`.order_date, sum(order_detail.order_quantity * product.product_price) as 'tong_tien' 
from customer join `order` on customer.customer_id = `order`.customer_id
join order_detail on `order`.order_id = order_detail.order_id 
join product on order_detail.product_id = product.product_id
group by order_detail.order_id;