def solution(s, n):
    answer = ''
    
    for i in s:
        if i.islower(): # 소문자일 경우
            answer += chr((ord(i) - ord('a') + n) % 26 + ord('a'))
        elif i.isupper(): # 대문자일 경우
            answer += chr((ord(i) - ord('A') + n) % 26 + ord('A'))
        else: # 대소문자가 아닐 경우 i를 그대로 추가
            answer += i
    
    return answer