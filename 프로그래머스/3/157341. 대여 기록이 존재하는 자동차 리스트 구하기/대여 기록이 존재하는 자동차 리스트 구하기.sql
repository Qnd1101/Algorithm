-- 코드를 입력하세요
SELECT distinct re.car_id as CAR_ID
from CAR_RENTAL_COMPANY_CAR re, CAR_RENTAL_COMPANY_RENTAL_HISTORY co
where re.car_id = co.car_id and car_type = '세단' and to_char(start_date, 'mm') >= '10'
order by CAR_ID desc;
