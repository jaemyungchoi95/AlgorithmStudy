def solution(a, b, n):
    answer = 0
    
    # 빈병의 갯수가 2개 이상일 동안 반복하면서
    while n >= a:
        ratio = (n//a) * b # 교환비에 따라 빈병을 a만큼 주면 콜라를 받는 값을 구해준다.
        answer += ratio # answer 에 교환비에 따라 받는 콜라에 갯수를 더해준다.
        n = ratio + int(n%a) # n은 다시 교환한 콜라의 몫과 아까 교환하지 못한 빈병으로 나누어준다.
    
    return answer