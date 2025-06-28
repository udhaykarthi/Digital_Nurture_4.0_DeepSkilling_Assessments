
CREATE TABLE Customers (
    CustomerID     NUMBER,
    Name           VARCHAR2(100),
    Age            NUMBER,
    Balance        NUMBER,
    IsVIP          CHAR(1) DEFAULT 'N'  
);


CREATE TABLE Loans (
    LoanID         NUMBER,
    CustomerID     NUMBER,
    InterestRate   NUMBER(5,2),   
    DueDate        DATE
);
