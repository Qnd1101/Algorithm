-- 코드를 입력하세요
-- 선생님 풀이
-- select name
-- from (select * from animal_ins order by datetime)
-- where rownum = 1;
SELECT NAME
FROM ANIMAL_INS
WHERE DATETIME = (SELECT MIN(DATETIME) FROM ANIMAL_INS);
