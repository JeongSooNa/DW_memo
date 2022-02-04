SELECT
    i.animal_id,
    i.animal_type,
    i.name
FROM animal_ins as i
JOIN animal_outs as o
ON i.animal_id = o.animal_id
WHERE
    (i.sex_upon_intake not like 'Spayed%'
    and
    i.sex_upon_intake not like 'Neutered%')
    and
    (o.sex_upon_outcome like 'Spayed%'
    or
    o.sex_upon_outcome like 'Neutered%')
ORDER BY i.animal_id