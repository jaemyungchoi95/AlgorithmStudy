def solution(box, n):
    temp = []
    
    for i in box:
        temp.append(i//n)
        
    
    return temp[0] * temp[1] * temp[2]