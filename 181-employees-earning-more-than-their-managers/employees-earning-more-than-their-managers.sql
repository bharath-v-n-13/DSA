select n1.name AS employee 
from employee n1
join employee n2 on n1.managerId = n2.id
where n1.salary > n2.salary;