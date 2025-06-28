DECLARE
    CURSOR cur_vip IS
        SELECT CustomerID, Balance FROM Customers
        WHERE Balance > 10000 AND IsVIP = 'N';

BEGIN
    FOR rec IN cur_vip LOOP
        UPDATE Customers
        SET IsVIP = 'Y'
        WHERE CustomerID = rec.CustomerID;

        DBMS_OUTPUT.PUT_LINE('Promoted to VIP: Customer ID ' || rec.CustomerID);
    END LOOP;

    COMMIT;
END;
/
