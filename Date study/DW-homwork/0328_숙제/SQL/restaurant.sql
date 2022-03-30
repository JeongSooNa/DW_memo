-- Mysql DDL
CREATE TABLE food(
    foodNo INTEGER(4) AUTO_INCREMENT PRIMARY KEY COMMENT '음식 번호',
    foodName VARCHAR(20) NOT NULL COMMENT '음식 이름',
    foodPrice INTEGER(4) NOT NULL COMMENT '음식 가격',
);
    
CREATE TABLE restaurant(
    restaurantNo INTEGER(4) AUTO_INCREMENT PRIMARY KEY COMMENT '레스토랑 번호',
    restaurantName VARCHAR(20) NOT NULL COMMENT '레스토랑 이름',
    foodNo INTEGER(4) NOT NULL COMMENT '음식 번호',
    FOREIGN KEY(foodNo) REFERENCES food(foodNo)
);

SELECT * FROM restaurant WHERE foodNo = 30 AND restaurantName= '빠스타스';
/* 문제 1.
레스토랑 테이블에 데이터가 일일 1000만건 저장된다. 
레스토랑 테이블에서 위에 작성한 select쿼리 호출 시간이 오래 걸리기 시작했다.
가장 먼저해야하는 바람직한 행동은?
답안 작성 =>
*/
/* select절에서 실행되기 전 where절에서 서브쿼리를 통해 data를 걸러내 실행시간을 줄인다. */
SELECT *
FROM restaurant
WHERE 
    foodNo in(
    SELECT foodNo
    FROM restaurant
    WHERE foodNo = 30
    ) 
    AND
    restaurantName in(
    SELECT restaurantName
    FROM restaurant
    WHERE restaurantName='빠스타스'
    )
;

DELETE FROM food
WHERE foodNo = 30;
/* 문제 2.
음식 테이블에 30번 음식 데이터를 지우려고 한다.
하지만 레스토랑 테이블에 30번 데이터가 있어서 지울 수가 없다. 
음식 테이블에 30번 데이터를 지울 방법은 무엇일까?
답안 작성 => 
*/
/* 위의 쿼리에서 on delete cascade를 추가하여 자식 데이터를 수정할 수 있도록 작성한다. */
CREATE TABLE restaurant(
    restaurantNo INTEGER(4) AUTO_INCREMENT PRIMARY KEY COMMENT '레스토랑 번호',
    restaurantName VARCHAR(20) NOT NULL COMMENT '레스토랑 이름',
    foodNo INTEGER(4) NOT NULL COMMENT '음식 번호',
    FOREIGN KEY(foodNo) REFERENCES food(foodNo) on delete cascade
    /* 해당 row는 살리고 30번column만 지우려면 set null*/
);
/* 또는 새로운 Column(데이터 존재 여부(true/false))을 만들어 관리한다. */
/* ex) isInData : true / false */