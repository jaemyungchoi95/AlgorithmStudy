SELECT mr.MEMBER_NAME, 
       rr.REVIEW_TEXT, 
       DATE_FORMAT(rr.REVIEW_DATE, '%Y-%m-%d') AS REVIEW_DATE
FROM REST_REVIEW rr
JOIN MEMBER_PROFILE mr ON rr.MEMBER_ID = mr.MEMBER_ID
WHERE
    rr.MEMBER_ID = (
        SELECT MEMBER_ID
        FROM REST_REVIEW
        GROUP BY MEMBER_ID
        ORDER BY COUNT(*) DESC
        LIMIT 1
    )
ORDER BY 3 ASC, 2 ASC