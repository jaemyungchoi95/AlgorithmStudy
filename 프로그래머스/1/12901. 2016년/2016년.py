from datetime import datetime

def solution(a, b):
    # 2016년 a월 b일의 날짜 생성
    date = datetime(2016, a, b)
    
    days = ["MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"]
    
    return days[date.weekday()]