CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest AS
BEGIN
    UPDATE SavingsAccounts
    SET Balance = Balance + (Balance * 0.01);  -- Apply 1% interest

    DBMS_OUTPUT.PUT_LINE('Monthly interest applied to all savings accounts.');

    COMMIT;
END;
/

BEGIN
    ProcessMonthlyInterest;
END;
/
