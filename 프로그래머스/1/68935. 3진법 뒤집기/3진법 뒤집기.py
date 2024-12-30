def solution(n):
    temp = "" # 임시변수 선언
    
    # 10진수 -> 3진수 변환과정
    while n > 0:
        temp = str(n % 3) + temp
        n //= 3
        
    # 3진수 문자열을 뒤집기
    reversed_temp = temp[::-1]
    
    # 뒤집은 문자열을 다시 10진수로 변경 후 반환
    return int(reversed_temp, 3)