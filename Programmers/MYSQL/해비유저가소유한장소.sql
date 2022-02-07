SELECT
    p1.*
FROM    (SELECT *
        FROM places
        GROUP BY host_id
        HAVING count(*)>1
        ) as p
INNER JOIN places as p1
ON p.host_id = p1.host_id
ORDER BY p1.id
/* FROM절에 쓰는 것이 효율적 */

/*
SELECT
    *
FROM places
WHERE host_id in (SELECT host_id
            FROM places
            GROUP BY host_id
            HAVING count(host_id)>1)
*/
