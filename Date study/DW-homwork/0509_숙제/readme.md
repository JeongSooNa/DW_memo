# 2022 05 06 Homework for Spring
Cording page : https://github.com/JeongSooNa/DW_Spring1.git

### Controller
```java
//문제 0. 급여 1500을 파라미터로 받고 부서가 10, 30에 속하는 사원 중 급여가 1500을 넘는 사원의 이름 및 급여 조회.
@GetMapping("/emp/sal/{sal}")
//문제 1. emp에서 사수가 없는 사원 조회
@GetMapping("/emp/mgr")
//문제 2. 1987년도를 파리미터로 받고 해당 년도에 입사한 사원 조회 
@GetMapping("/emp/hiredate/year/{year}")
//문제 3. 12월를 파라미터로 받고 해당 월에 입사한 사원 중 급여가 가장 많은 사원 조회
@GetMapping("/emp/hiredate/month/{month}")
//문제 4. MANAGER를 파라미터로 받고 job이 MANAGER 중 입사날짜가 가장 빠른 사원의 이름, 입사날짜, 급여 조회 
@GetMapping("/emp/job/{jobName}")
//(join 문제)*문제 5. 사원번호 7782를 파라미터로 받고 해당 사원의 모든 정보(부서번호, 부서이름, 부서위치 포함) 조회
@GetMapping("/emp/empno/{empno}")
```
### Service (Business Logic)
```java
//문제 2. 1987년에 입사한 사원 수가 3명 이하면 1981년에 입사한 사원으로 조회하시오.
//문제 3. 급여가 가장 높은 사원 조회
//문제 4. 입사날짜 빠른 사원 조회 (쿼리 2개필요 OR 쿼리하나로 해결 가능)
```
### Mapper (Persistence)
```sql
<!-- 문제 0. 부서가 10, 30에 속하는 사원 중 급여가 1500을 넘는 사원의 이름 및 급여 조회 -->
<!-- 문제 1. MGR이 NULL인 사원 이름, 직업, 급여 조회 -->
<!-- 문제 2. 특정 년도에 입사한 사원 이름, 직업, 입사날짜, 급여 조회-->
<!-- 문제 3. 입사 날짜가12월에 입사한 사원 이름, 급여 조회-->
<!-- 문제 4. 특정 job에 속한 사원번호, 사원 이름, 입사날짜 조회 -->
<!-- 문제 5. 특정 사원의 모든 정보 조회(emp, dept 테이블 조인) -->
```



# 문제0
![jpg](./img/%EC%BA%A1%EC%B2%98.JPG)

# 문제1
![jpg](./img/%EC%BA%A1%EC%B2%981.JPG)

# 문제2
![jpg](./img/%EC%BA%A1%EC%B2%982.JPG)

# 문제3
![jpg](./img/%EC%BA%A1%EC%B2%983.JPG)

# 문제4
![jpg](./img/%EC%BA%A1%EC%B2%984.JPG)
- VO file의 date type을 sql과 java가 연동되지 않는 것일까
- date 형식이 불러와지지 않는다.
- as hiredate로 이름 같게 해 해결!
# 문제5
![jpg](./img/%EC%BA%A1%EC%B2%985.JPG)

- 일단 join VO 를 새로 생성하여 풀었으나 다른방법도 찾아보아야 겠다.