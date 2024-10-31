def solution(date1, date2):
    if date1 == date2:
        return 0
    
    for i in range(len(date1)):
        if date1[i] != date2[i]:
            return 1 if date1[i] < date2[i] else 0