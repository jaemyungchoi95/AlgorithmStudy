def solution(numbers):
    answer = [] # 나올 수 있는 값을 담아주는 함수
    
    for i in range(len(numbers)):
        for j in range(i+1, len(numbers)):
            answer.append(numbers[i] * numbers[j])
    
    return max(answer)