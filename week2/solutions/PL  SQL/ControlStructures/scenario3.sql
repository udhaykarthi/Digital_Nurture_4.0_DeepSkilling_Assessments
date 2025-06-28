DECLARE
    CURSOR cur_due_loans IS
        SELECT l.LoanID, l.DueDate, c.Name
        FROM Loans l
        JOIN Customers c ON c.CustomerID = l.CustomerID
        WHERE l.DueDate BETWEEN SYSDATE AND SYSDATE + 30;

BEGIN
    FOR rec IN cur_due_loans LOOP
        DBMS_OUTPUT.PUT_LINE('Reminder: Loan ID ' || rec.LoanID ||
                             ' for customer ' || rec.Name ||
                             ' is due on ' || TO_CHAR(rec.DueDate, 'DD-Mon-YYYY'));
    END LOOP;
END;
/
