def solution(s):
    answer = []
    tempS = s.split(" ")
    
    for i in tempS:
        tempword = ""
        for j in range(len(i)):
            # 인덱스가 짝수일 경우
            if j%2 == 0:
                tempword += i[j].upper()
            else:
                tempword += i[j].lower()
        answer.append(tempword)
    
    return " ".join(answer)