-- 코드를 입력하세요
SELECT MEMBER_ID, MEMBER_NAME, GENDER, TO_CHAR(DATE_OF_BIRTH,'YYYY-MM-DD') AS DATE_OF_BIRTH
FROM MEMBER_PROFILE
WHERE TO_CHAR(DATE_OF_BIRTH,'MM') = '03'
AND TLNO IS NOT NULL
AND GENDER = 'W'
ORDER BY MEMBER_ID;
