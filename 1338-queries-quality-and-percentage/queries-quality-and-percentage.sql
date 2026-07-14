# Write your MySQL query statement below
select query_name,
ROUND(AVG(rating/position), 2) AS quality,
ROUND(
    sum( case when rating<3 then 1
else 0 end) *100/COUNT(*),2
) AS poor_query_percentage
FROM  Queries
group   by query_name;