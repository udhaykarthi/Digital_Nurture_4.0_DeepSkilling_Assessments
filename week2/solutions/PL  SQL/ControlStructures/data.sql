
DELETE FROM Customers;


INSERT INTO Customers (CustomerID, Name, Age, Balance, IsVIP) VALUES (101, 'Ravi Kumar', 65, 12000, 'N');
INSERT INTO Customers (CustomerID, Name, Age, Balance, IsVIP) VALUES (102, 'Sneha Reddy', 59, 8000, 'N');
INSERT INTO Customers (CustomerID, Name, Age, Balance, IsVIP) VALUES (103, 'Arjun Mehta', 70, 15000, 'N');
INSERT INTO Customers (CustomerID, Name, Age, Balance, IsVIP) VALUES (104, 'Meera Nair', 45, 2000, 'N');
INSERT INTO Customers (CustomerID, Name, Age, Balance, IsVIP) VALUES (105, 'Karthik Raj', 61, 9000, 'N');
INSERT INTO Customers (CustomerID, Name, Age, Balance, IsVIP) VALUES (106, 'Divya Sinha', 35, 11000, 'N');
INSERT INTO Customers (CustomerID, Name, Age, Balance, IsVIP) VALUES (107, 'Vikram Das', 63, 10000, 'N');

COMMIT;



DELETE FROM Loans;


INSERT INTO Loans (LoanID, CustomerID, InterestRate, DueDate) VALUES (201, 101, 9.5, SYSDATE + 10);   -- Due soon
INSERT INTO Loans (LoanID, CustomerID, InterestRate, DueDate) VALUES (202, 102, 8.0, SYSDATE + 45);   -- Not due
INSERT INTO Loans (LoanID, CustomerID, InterestRate, DueDate) VALUES (203, 103, 10.0, SYSDATE + 5);   -- Due soon
INSERT INTO Loans (LoanID, CustomerID, InterestRate, DueDate) VALUES (204, 104, 7.5, SYSDATE + 29);   -- Due soon
INSERT INTO Loans (LoanID, CustomerID, InterestRate, DueDate) VALUES (205, 105, 9.0, SYSDATE + 60);   -- Not due
INSERT INTO Loans (LoanID, CustomerID, InterestRate, DueDate) VALUES (206, 106, 8.5, SYSDATE - 5);    -- Already due
INSERT INTO Loans (LoanID, CustomerID, InterestRate, DueDate) VALUES (207, 107, 10.5, SYSDATE + 15);  -- Due soon

COMMIT;
