SELECT 
    distinct cart_id
FROM cart_products
WHERE
    cart_id in (SELECT cart_id
                FROM cart_products
                GROUP BY cart_id, name
                HAVING name = 'Milk')
    and
    cart_id in (SELECT cart_id
                FROM cart_products
                GROUP BY cart_id, name
                HAVING name = 'Yogurt')
ORDER BY cart_id