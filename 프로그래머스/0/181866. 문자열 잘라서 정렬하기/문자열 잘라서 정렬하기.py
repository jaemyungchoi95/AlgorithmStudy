def solution(myString):
    answer = sorted(list(myString.split('x')))
    
    return ' '.join(answer).split()