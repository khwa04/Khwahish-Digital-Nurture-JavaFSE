---------------------------------------------------
-- ProcessMonthlyInterest
---------------------------------------------------

CREATE OR REPLACE PROCEDURE

ProcessMonthlyInterest

AS

BEGIN


UPDATE Accounts

SET Balance =

Balance +

(Balance*0.01)

WHERE AccountType='Savings';


COMMIT;

END;

/


---------------------------------------------------
-- UpdateEmployeeBonus
---------------------------------------------------

CREATE OR REPLACE PROCEDURE

UpdateEmployeeBonus(

dept_name VARCHAR2,

bonus_percent NUMBER

)

AS

BEGIN


UPDATE Employees

SET Salary =

Salary +

(

Salary

*

bonus_percent

/100

)

WHERE Department = dept_name;


COMMIT;


END;

/



---------------------------------------------------
-- TransferFunds
---------------------------------------------------

CREATE OR REPLACE PROCEDURE

TransferFunds(

source_acc NUMBER,

target_acc NUMBER,

amount NUMBER

)

AS


source_balance NUMBER;


BEGIN


SELECT Balance

INTO source_balance

FROM Accounts

WHERE AccountID=source_acc;



IF source_balance >= amount

THEN


UPDATE Accounts

SET Balance =

Balance-amount

WHERE AccountID=source_acc;



UPDATE Accounts

SET Balance =

Balance+amount

WHERE AccountID=target_acc;



COMMIT;


DBMS_OUTPUT.PUT_LINE(

'Transfer Successful'

);


ELSE


DBMS_OUTPUT.PUT_LINE(

'Insufficient Balance'

);


END IF;


END;

/