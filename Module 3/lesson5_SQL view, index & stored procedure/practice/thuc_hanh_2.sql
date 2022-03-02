delimiter // 
CREATE PROCEDURE findAllCustomers ()
BEGIN 
SELECT * FROM customers;
END // 
delimiter ;

CALL findAllCustomers();

delimiter // 
DROP PROCEDURE IF EXISTS `findAllCustomers` //

CREATE PROCEDURE findAllCustomers()

BEGIN

SELECT * FROM customers WHERE customerNumber = 175;

END //