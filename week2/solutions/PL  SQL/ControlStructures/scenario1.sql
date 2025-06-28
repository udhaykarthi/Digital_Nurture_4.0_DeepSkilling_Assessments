DECLARE
    CURSOR cur_customers IS
        SELECT c.CustomerID, l.LoanID, l.InterestRate
        FROM Customers c
        JOIN Loans l ON c.CustomerID = l.CustomerID
        WHERE c.Age > 60;

BEGIN
    FOR rec IN cur_customers LOOP
        UPDATE Loans
        SET InterestRate = InterestRate - 1
        WHERE LoanID = rec.LoanID;

        DBMS_OUTPUT.PUT_LINE('Applied 1% discount to Loan ID: ' || rec.LoanID);
    END LOOP;
    
    COMMIT;
END;
/
