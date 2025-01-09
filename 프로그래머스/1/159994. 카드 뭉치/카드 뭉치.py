def solution(cards1, cards2, goal):
    # goal 배열을 순차적으로 탐색하면서
    for i in goal:
        # 만약 i가 cards1의 0번 인덱스에 있으면 cards1의 0번 인덱스를 빼주고
        if cards1 and i == cards1[0]:
            cards1.pop(0)
        # 만약 i가 cards2에 있으면 cards2의 0번 인덱스를 빼준다.
        elif cards2 and i == cards2[0]:
            cards2.pop(0)
        # 그러다 위의 두 경우에 해당하지 않게 되면 'No를 반환한다'
        else:
            return 'No'
    
    return 'Yes'