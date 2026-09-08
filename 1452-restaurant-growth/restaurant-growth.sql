SELECT visited_on,moving_sum as amount,
    round(moving_sum/7,2) as average_amount
FROM (
    SELECT
        visited_on,
        amount,
        SUM(amount) OVER (
            ORDER BY visited_on
            ROWS BETWEEN 6 PRECEDING AND CURRENT ROW
        ) AS moving_sum
    FROM(
        SELECT
            visited_on,
            SUM(amount) AS amount
        FROM Customer
        GROUP BY visited_on
    ) daily
) t
ORDER BY visited_on
LIMIT 100000 OFFSET 6;