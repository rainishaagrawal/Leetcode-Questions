# Write your MySQL query statement below
SELECT  product_name, year, price
FROM product p
LEFT JOIN sales s
    ON p.product_id = s.product_id where year is not null;