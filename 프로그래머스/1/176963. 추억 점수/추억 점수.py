def solution(name, yearning, photo):
    answer = []
    scores = dict(zip(name, yearning)) # 이름과 점수를 딕셔너리로 저장
    
    # photo 배열을 탐색
    for i in photo:
        temp = 0 # 임시변수를 선언해주고
        for j in i: # 2차원배열을 탐색하면서
            temp += scores.get(j, 0) 
        answer.append(temp)
    
    return answer