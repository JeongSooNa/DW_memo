-- 학생 수
select 
	count(*)
from students
-- 게시글 수
union
select
	count(*) 	
from board
-- 작성자 수
union
select 
	count(distinct(b.students_id)) 
from board as b
inner join students as s
on b.students_id = s.students_id 
-- 조회 수
union
select 
	sum(cnt)
from board
;

-- 서브쿼리 이용해 한번에 표시
select 
	(select 
		count(*)
	from students) as stdentsCnt,
	count(*) as boardCnt,
	(select 
	count(distinct(b.students_id)) 
	from board as b
	inner join students as s
	on b.students_id = s.students_id ) as writerCnt,
	sum(cnt) as readCnt
from board
;


-- 1~5번만 출력
select 
	*
from emp
limit 0, 10 -- limit startPage-1, pageNum 이 온다.
;