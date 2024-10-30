def solution(myString):
    answer = list(myString.split('x'))
    
    return [len(x) for x in answer]