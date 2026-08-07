# Write your MySQL query statement below
SELECT emp.name AS Employee FROM Employee AS emp JOIN Employee as mg ON emp.ManagerId=mg.id WHERE emp.salary>mg.salary;