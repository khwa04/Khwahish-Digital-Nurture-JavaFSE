SET SERVEROUTPUT ON;

------------------------------------------------
-- Scenario 1
-- Discount interest rates for customers > 60
------------------------------------------------

BEGIN

FOR rec IN (

SELECT
CustomerID,
DOB

FROM Customers

)

LOOP

IF TRUNC(

MONTHS_BETWEEN(

SYSDATE,

rec.DOB

)/12

) > 60

THEN

UPDATE Loans

SET InterestRate = InterestRate - 1

WHERE CustomerID = rec.CustomerID;

END IF;

END LOOP;

COMMIT;

END;

/


------------------------------------------------
-- Scenario 2
-- VIP Customers
------------------------------------------------

ALTER TABLE Customers

ADD IsVIP VARCHAR2(5);



BEGIN

FOR cust IN (

SELECT CustomerID,

Balance

FROM Customers

)

LOOP

IF cust.Balance > 10000

THEN

UPDATE Customers

SET IsVIP='TRUE'

WHERE CustomerID=cust.CustomerID;

END IF;

END LOOP;

COMMIT;

END;

/



------------------------------------------------
-- Scenario 3
-- Loan reminders
------------------------------------------------

BEGIN

FOR loan IN (

SELECT

CustomerID,

EndDate

FROM Loans

WHERE EndDate

BETWEEN SYSDATE

AND SYSDATE+30

)

LOOP


DBMS_OUTPUT.PUT_LINE(

'Reminder sent to Customer ID '

||

loan.CustomerID

||

' Loan Due Date : '

||

loan.EndDate

);

END LOOP;

END;

/