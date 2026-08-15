# Write your MySQL query statement below
SELECT p.product_name, s.year, s.price
FROM Sales as s
JOIN Product as p
ON S.PRODUCT_ID=P.PRODUCT_ID