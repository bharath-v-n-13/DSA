select s.name,b.bonus
from employee s
left join bonus b
on s.empid=b.empid
where b.bonus<1000 or bonus is null;