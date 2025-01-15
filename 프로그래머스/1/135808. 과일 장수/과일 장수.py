def solution(k, m, score):
    answer = 0
    score.sort(reverse = True) # 과일을 오름차순으로 정렬
    
    # 오름차순으로 정렬된 과일의 점수를 한박스당 가장 낮은 점수일 첫번째 박스의 m번째부터 m개 단위로 순회하면서 
    for i in range(m-1, len(score), m):
        answer += score[i] * m # 값을 answer에 담아준다
    return answer
    