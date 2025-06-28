BEGIN
    FOR rec IN (SELECT CustomerID, DOB FROM Customers) LOOP
        DECLARE
            v_age NUMBER;
        BEGIN
            v_age := FLOOR(MONTHS_BETWEEN(SYSDATE, rec.DOB) / 12);
            IF v_age > 60 THEN
                DBMS_OUTPUT.PUT_LINE('Customer ID ' || rec.CustomerID || ' is senior. Discount applied!');
            ELSE
                DBMS_OUTPUT.PUT_LINE('Customer ID ' || rec.CustomerID || ' is not eligible.');
            END IF;
        END;
    END LOOP;
END;