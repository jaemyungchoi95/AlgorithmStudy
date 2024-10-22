def solution(friends, gifts):
    giftsArr = [] # gifts를 2차원 배열로 재구성 [['준친구', '받은친구'], ['준친구', '받은친구']]
    thisWeekCtn = [[0] * len(friends) for _ in range(len(friends))] # 이번달 선물 준 횟수 카운트
    thisWeekScore = [0] * len(friends) # 이번달 선물지수 카운트 (최종 점수만 카운트 해서 넣으면 됨)
    nextWeekCtn = [0] * len(friends) # 다음달 선물 예상 카운트 (받은거만 카운트 해서 넣으면 되니까 1차원이면 됨)

    # gifts 를 2차원 배열로 재구성
    for i in gifts:
        giftsArr.append(i.split())

    # 선물받은 횟수 카운트
    for i in giftsArr:
        giver = friends.index(i[0])
        reciever = friends.index(i[1])
        thisWeekCtn[giver][reciever] += 1

    # 선물지수 계산
    for i in range(len(friends)):
        for j in range(len(friends)):
            thisWeekScore[i] += thisWeekCtn[i][j] # 준 선물만큼 더해주고
            thisWeekScore[i] -= thisWeekCtn[j][i] # 받은 선물만큼 다시 빼준다

    # 다음달 예상 스코어 작성
    for i in range(len(thisWeekCtn)):
        for j in range(i+1, len(thisWeekCtn)):
            if i != j: # i 와 j 값이 같으면 자기 자신이므로, i,j가 같지 않을때만 아래의 연산을 진행한다.
                if thisWeekCtn[i][j] - thisWeekCtn[j][i] != 0: # 주고받은 기록이 있다면 (0보다 크면) 아래와 같이 비교한다.
                    if thisWeekCtn[i][j] - thisWeekCtn[j][i] != 0:
                        if thisWeekCtn[i][j] > thisWeekCtn[j][i]: # 만약 A가 B보다 선물을 많이 줬으면
                            nextWeekCtn[i] += 1 # A가 선물을 받는다.
                        else: # 그게 아니라면 (B가 선물을 더 많이 줬다면)
                            nextWeekCtn[j] += 1 # B가 선물을 받는다.

                elif thisWeekCtn[i][j] - thisWeekCtn[j][i] == 0: # 주고받은 수가 0이거나 서로 같다면
                    if thisWeekScore[i] > thisWeekScore[j]: # 이번달의 선물지수를 비교해서 A가 B보다 크다면
                        nextWeekCtn[i] += 1 # 다음달 A가 선물을 받는다
                    elif thisWeekScore[i] < thisWeekScore[j]: # 이번달의 선물지수를 비교해서 B가 A보다 크다면
                        nextWeekCtn[j] += 1 # 다음달 B가 선물을 받는다.

    return max(nextWeekCtn)