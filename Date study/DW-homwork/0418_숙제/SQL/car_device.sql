-- 테이블 설명
--    상원아이티는 아프리카에 차량렌트사업을 하려고 한다.
--    아프리카는 도난률이 높아 렌트차량에 IoT디바이스를 부착시켜 실시간으로 위치를 추적하려고 한다.
--    devices는 IoT디바이스 정보가 저장.
--    car_information는 렌트 차량 정보가 저장. 
--    단, 디바이스가 부착된 렌트 차량 정보만 저장할 수 있다.
--    car_event_log은 IoT디바이스가 부착된 렌트차량 이벤트(운행기록)가 저장.

-- 변수명 설명
	-- [device]
		-- device_uuid 		: 디바이스 고유 번호(PK)
		-- bettery 			: 배터리 잔량
		-- firmware_ver 	: 펌웨어 버전
		-- is_use 			: 디바이스 사용여부
		-- create_at 		: 등록날짜
	-- [car_information]
		-- car_number 		: 차량번호판(PK)
		-- device_uuid 		: 디바이스 고유 번호(FK)
		-- admin_name		: 담당자 이름 
		-- odometer			: 주행 거리
		-- latitude			: 현재 위도
		-- longitude 		: 현재 경도
		-- create_at 		: 등록 날짜 
	-- [car-event_log]
		-- log_srl			: 히스토리 번호(PK)
		-- car_number 		: 차량번호판(FK)
		-- event_type		: 이벤트 타입 (1: 정상, 2: 배터리 부족, 3: 탈착, 4: 통신 이상)
		-- latitude			: 위도
		-- longitude 		: 경도
		-- create_at 		: 이벤트 날짜 

-- 문제

-- 1. 차량 수 조회
SELECT count(*)
FROM car_information
;

-- 2. 차량에 부착된 디바이스 uuid, battery, create_at 조회.
SELECT
	ci.device_uuid,
	d.battery ,
	d.create_at
FROM car_information as ci
LEFT JOIN devices as d
ON ci.device_uuid = d.device_uuid
;

-- 3. UUID '20130099', 배터리 100, 펌웨어 버전 '1.0.1', 사용여부 TRUE인 디바이스를 devices에 등록하시오.
INSERT INTO devices(device_uuid, battery, firmware_ver, is_use) VALUES('20130099', 100, '1.0.1', TRUE);

-- 4. 2022-04-11 이후 탈착 이벤트가 1건 이상 발생된 UUID, 펌웨어 버전 조회.
SELECT
	ci.device_uuid,
	d.firmware_ver ß
FROM car_information as ci
LEFT JOIN car_event_log as cel
ON ci.car_number = cel.car_number
LEFT JOIN devices as d 
ON ci.device_uuid = d.device_uuid 
WHERE 
	cel.create_at >= "2022-04-11"
	AND
	cel.event_type = 3
GROUP BY ci.device_uuid
HAVING COUNT(*) >= 1 
;

-- 5. 2022-04-11 ~ 2022-04-13 일별 이벤트 카운트 조회.
SELECT
	DATE_FORMAT(create_at,'%Y-%m-%d'),
	COUNT(*)
FROM car_event_log
WHERE 
	create_at >= "2022-04-11"
	AND 
	create_at <= "2022-04-13"
GROUP BY DATE_FORMAT(create_at,'%Y-%m-%d') 
;

-- 6. 전체 디바이스 수, 차량에 부착된 디바이스 수, 차량에 부착하지 않은 디바이스 수 조회.
SELECT 
	COUNT(d.device_uuid) as '전체 수',
	COUNT(ci.device_uuid) as '부착 수',
	COUNT(d.device_uuid)-COUNT(ci.device_uuid) as '부착안된 수'
FROM devices as d
LEFT JOIN car_information as ci
ON d.device_uuid = ci.device_uuid 
;

-- 7. 차량번호 '359서 9096'의 2022-04-11 ~ 2022-04-13일까지 이벤트별 카운트 조회
SELECT 
	event_type ,
	COUNT(*)
FROM car_event_log as cel 
WHERE 
	car_number = "359서 9096"
	AND 
	create_at >= "2022-04-11"
	AND 
	create_at <= "2022-04-13"
GROUP BY event_type 
;

-- 8. UUID가 '20133344'인 디바이스의 2022-04-11 ~ 2022-04-13에 발생한 이벤트타입, 이벤트 날짜, 차량번호판, 담당자 조회.
SELECT
	cel.event_type as "이벤트타입",
	cel.create_at as "이벤트 날짜",
	cel.car_number as "차량번호판",
	ci.admin_name as "담당자"
FROM car_information as ci
RIGHT JOIN car_event_log as cel
ON ci.car_number = cel.car_number 
WHERE 
	ci.device_uuid = "20133344"
	AND 
	cel.create_at >= "2022-04-11"
	AND 
	cel.create_at <= "2022-04-13"
;

