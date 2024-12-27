def solution(d, budget):
    answer = 0
    
    # 먼저 부서를 오름차순으로 정렬
    d.sort()
    
    # 정렬된 부서를 순환하면서 
    for i in d:
        if budget >= i: # 만약 예산이 i보다 크면
            budget -= i  # 예산에서 i만큼 차감하고 answer 에 1 카운트
            answer += 1
        else: # 예산이 충분하지 않다면 끝
            break

    return answer