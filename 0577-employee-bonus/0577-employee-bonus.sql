# Write your MySQL query statement below
SELECT E.name,B.bonus FROM Employee E lEFT JOIN
Bonus B on E.empId=B.empId WHERE B.bonus IS NULL OR B.bonus<1000;