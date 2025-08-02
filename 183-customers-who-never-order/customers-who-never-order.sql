select c.name as Customers
from customers c LEFT JOIN  Orders O
ON c.id=o.customerid
WHERE o.customerid is null;