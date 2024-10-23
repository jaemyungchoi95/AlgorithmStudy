def solution(hp):
    answer = 0
    
    star = 5 # 장군
    soldier = 3 # 병정
    
    if hp//star > 0: # hp를 장군으로 나눈 몫만큼
        answer += hp//star # 장군을 투입시키고
        hp = hp%star # hp에 장군으로 나눈 나머지를 업데이트

    if hp//soldier > 0:
        answer += hp//soldier
        answer += hp%soldier
    
    if hp < soldier:
        answer += hp
    
    return answer