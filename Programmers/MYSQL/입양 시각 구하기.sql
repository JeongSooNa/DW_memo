SELECT 
    d.datetime,
    count(date_format(a.datetime,'%H'))
FROM (
    SELECT 00 datetime FROM DUAL UNION ALL
    SELECT 01 datetime FROM DUAL UNION ALL
    SELECT 02 datetime FROM DUAL UNION ALL
    SELECT 03 datetime FROM DUAL UNION ALL
    SELECT 04 datetime FROM DUAL UNION ALL
    SELECT 05 datetime FROM DUAL UNION ALL
    SELECT 06 datetime FROM DUAL UNION ALL
    SELECT 07 datetime FROM DUAL UNION ALL
    SELECT 08 datetime FROM DUAL UNION ALL
    SELECT 09 datetime FROM DUAL UNION ALL
    SELECT 10 datetime FROM DUAL UNION ALL
    SELECT 11 datetime FROM DUAL UNION ALL
    SELECT 12 datetime FROM DUAL UNION ALL
    SELECT 13 datetime FROM DUAL UNION ALL
    SELECT 14 datetime FROM DUAL UNION ALL
    SELECT 15 datetime FROM DUAL UNION ALL
    SELECT 16 datetime FROM DUAL UNION ALL
    SELECT 17 datetime FROM DUAL UNION ALL
    SELECT 18 datetime FROM DUAL UNION ALL
    SELECT 19 datetime FROM DUAL UNION ALL
    SELECT 20 datetime FROM DUAL UNION ALL
    SELECT 21 datetime FROM DUAL UNION ALL
    SELECT 22 datetime FROM DUAL UNION ALL
    SELECT 23 datetime FROM DUAL
) as d
/* 
select 해서 나온
테이블 : d
컬럼 : datetime
data : 00~23
UNION ALL(ALL빼면 중복 제거) 해서 나온
출력을 하나의 table로 인식하여 from절에 사용
*/
LEFT JOIN animal_outs as a
ON d.datetime = date_format(a.datetime,'%H')
GROUP BY d.datetime
ORDER BY d.datetime