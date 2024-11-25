def solution(absolutes, signs):
    answer = 0;
    
    for i in range(len(signs)):
        if(str(signs[i]) == "False"):
            answer -= absolutes[i];
            print("false일때 :" ,answer)
        else:
            answer += absolutes[i];
            print("true일때 :" ,answer)
    
    return answer;