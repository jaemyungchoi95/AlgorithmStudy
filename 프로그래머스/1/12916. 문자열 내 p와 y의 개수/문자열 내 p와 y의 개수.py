def solution(s):
    low = s.lower() # 문자열을 전부 소문자로 변환
    
    if low.count("p") == low.count("y"):
        return True
    else:
        return False