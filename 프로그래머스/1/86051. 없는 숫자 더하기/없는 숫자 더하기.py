def solution(numbers):
    temp = [0]*10;
    answer = 0;
    
    for i in numbers:
        temp[i] += 1;
    
    for i in range(len(temp)):
        if (temp[i] == 0) :
            answer += i;

    return answer;