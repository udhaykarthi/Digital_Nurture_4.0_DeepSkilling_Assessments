
DELETE FROM SavingsAccounts;


INSERT INTO SavingsAccounts (AccountID, CustomerID, Balance) VALUES (1001, 201, 5000.00);
INSERT INTO SavingsAccounts (AccountID, CustomerID, Balance) VALUES (1002, 202, 10000.00);
INSERT INTO SavingsAccounts (AccountID, CustomerID, Balance) VALUES (1003, 203, 750.50);
INSERT INTO SavingsAccounts (AccountID, CustomerID, Balance) VALUES (1004, 204, 0.00);
INSERT INTO SavingsAccounts (AccountID, CustomerID, Balance) VALUES (1005, 205, 8500.25);

COMMIT;


DELETE FROM Employees;


INSERT INTO Employees (EmpID, Name, DepartmentID, Salary) VALUES (1, 'Arun V.', 10, 40000);
INSERT INTO Employees (EmpID, Name, DepartmentID, Salary) VALUES (2, 'Bhavana P.', 10, 45000);
INSERT INTO Employees (EmpID, Name, DepartmentID, Salary) VALUES (3, 'Chandan M.', 20, 38000);
INSERT INTO Employees (EmpID, Name, DepartmentID, Salary) VALUES (4, 'Divya K.', 30, 52000);
INSERT INTO Employees (EmpID, Name, DepartmentID, Salary) VALUES (5, 'Eshwar N.', 20, 47000);

COMMIT;


DELETE FROM Accounts;


INSERT INTO Accounts (AccountID, CustomerID, Balance) VALUES (2001, 201, 3000);
INSERT INTO Accounts (AccountID, CustomerID, Balance) VALUES (2002, 202, 1500);
INSERT INTO Accounts (AccountID, CustomerID, Balance) VALUES (2003, 203, 50);     
INSERT INTO Accounts (AccountID, CustomerID, Balance) VALUES (2004, 204, 10000);  
INSERT INTO Accounts (AccountID, CustomerID, Balance) VALUES (2005, 205, 500);

COMMIT;
