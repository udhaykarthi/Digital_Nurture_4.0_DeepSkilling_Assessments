
CREATE TABLE SavingsAccounts (
    AccountID     NUMBER PRIMARY KEY,
    CustomerID    NUMBER,
    Balance       NUMBER(10,2)
);

CREATE TABLE Employees (
    EmpID         NUMBER PRIMARY KEY,
    Name          VARCHAR2(100),
    DepartmentID  NUMBER,
    Salary        NUMBER(10,2)
);


CREATE TABLE Accounts (
    AccountID     NUMBER PRIMARY KEY,
    CustomerID    NUMBER,
    Balance       NUMBER(10,2)
);
