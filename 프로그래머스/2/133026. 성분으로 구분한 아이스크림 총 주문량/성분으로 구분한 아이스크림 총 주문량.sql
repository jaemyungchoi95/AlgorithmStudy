SELECT i.INGREDIENT_TYPE, SUM(TOTAL_ORDER)
FROM FIRST_HALF h
JOIN ICECREAM_INFO i ON h.FLAVOR = i.FLAVOR
GROUP BY i.INGREDIENT_TYPE