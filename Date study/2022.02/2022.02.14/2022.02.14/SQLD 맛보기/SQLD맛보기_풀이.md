# [SQLD 맛보기]

### 1. 40 * > 20* > 10!!
- default값이 지정된 이후 입력된 data 1개
### 2. 3

### 3. 1

### 4. 2 * > 3
- group화 되지 않아 하나씩 전부 count하여 2개x 4개 조회
- and 말고 or로 생각하여 전부 count

### 5. 3 * > 2* > 3....
- A의 사수 ID = B의 ID
- 즉, A:부하직원 / B:상사
- 그래서 답은 1. 어떤 부하직원보다도 연봉이 높은 상사.

### 6. 1 3* > 1 4* > ...
- 이것은 확인해놓자!
- DML : SELECT DELETE INSERT UPDATE
> Data Manipulation Language
- DDL : CREATE DROP ALTER
> Data Definition Language
- DCL : GRANT REVOKE
> Data Control Language
- TCL : COMMIT ROLLBACK
> Transaction Control Language
- 정답 : 1 2

### 7. 4* > 3
- NULL...

### 8. 4

### 9. 1
- AS 는 MYSQL에서는 사용 가능하지만 ORACLE에서는 사용 불가.