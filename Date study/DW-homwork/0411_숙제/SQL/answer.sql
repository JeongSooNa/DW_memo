/* 04.11 SQL Homework */
-- 1. 탈퇴하지 않은 고객 아이디와 이름, 등급 조회.
SELECT
	customer_id,
	grade
FROM customer
WHERE
	is_use = 0
;

-- 2. '2021-12-09' 이후에 가입한 고객 수 조회.
SELECT 
	COUNT(*)
FROM customer
WHERE 
	create_at > '2021-12-09'
;

-- 3. 구매이력이 있는 고객 아이디와, 이름, 구매날짜, 비용 조회.
SELECT 
	c.customer_id as '고객 아이디',
	c.customer_name as '이름',
	chp.create_at as '구매날짜',
	chp.cost as '구매비용'
FROM customer as c
RIGHT JOIN customer_history_purchase as chp
ON c.customer_id = chp.customer_id
;

-- 4. 등록된 고객 중 한 번도 구매 이력이 없는 고객 아이디, 이름, 회원 탈퇴 여부 조회.
SELECT 
	c.customer_id as '고객 아이디',
	c.customer_name as '이름',
	CASE c.is_use WHEN 0 THEN 'true' ELSE 'false' END as '회원탈퇴여'
FROM customer as c
LEFT JOIN customer_history_purchase as chp
ON c.customer_id = chp.customer_id
WHERE chp.history_no IS NULL
;

-- 5. '2022-01-03'기준 고객 아이디별 구매 건수와 총 비용, 이름, 등급 조회.
SELECT 
	COUNT(*) as '구매건수',
	SUM(chp.cost) as '총 비용',
	c.customer_name as '이름',
	c.grade as '등급' 
FROM customer as c
RIGHT JOIN customer_history_purchase as chp
ON c.customer_id = chp.customer_id
WHERE chp.create_at = '2022-01-03'
GROUP BY chp.customer_id 
;

-- 6. '2022-01-03'기준 3번 이상 구매한 고객 아이디, 이름, 등급 조회.
SELECT 
	chp.customer_id as '고객 아이디',
	c.customer_name as '이름',
	c.grade as '등급' 
FROM customer as c
RIGHT JOIN customer_history_purchase as chp
ON c.customer_id = chp.customer_id
WHERE chp.create_at = '2022-01-03'
GROUP BY chp.customer_id 
HAVING COUNT(*) >=3
;

-- 7. 고객번호가 5194998인 고객 등급을 골드로 업데이트 하시오.
UPDATE customer SET grade='골드'
WHERE customer_id = 5194998
;
