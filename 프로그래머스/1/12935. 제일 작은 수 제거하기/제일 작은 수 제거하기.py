def solution(arr):
    answer = [];
    minInt = min(arr);
    
    if len(arr) == 1:
        return [-1]
    else:
        arr.pop(arr.index(minInt));
        return arr;