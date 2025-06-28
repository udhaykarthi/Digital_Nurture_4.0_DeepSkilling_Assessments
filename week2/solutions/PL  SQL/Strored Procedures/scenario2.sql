CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
    p_dept_id   IN NUMBER,
    p_bonus_pct IN NUMBER  -- e.g., 10 for 10%
) AS
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * (p_bonus_pct / 100))
    WHERE DepartmentID = p_dept_id;

    DBMS_OUTPUT.PUT_LINE('Bonus of ' || p_bonus_pct || '% applied to Department ' || p_dept_id);

    COMMIT;
END;
/

BEGIN
    UpdateEmployeeBonus(p_dept_id => 101, p_bonus_pct => 5);
END;
/
