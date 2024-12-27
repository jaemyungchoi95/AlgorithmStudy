def solution(s):
    answer = []
    tempArr = []
    
    # 문자열 s를 탐색하면서
    for i in range(len(s)):
        # 만약 s[i]번째 문자열이 tempArr에 없으면  
        if s[i] not in tempArr:
            tempArr.append(s[i]) # tempArr에 s[i]문자열을 추가하고
            answer.append(-1) # answer 배열에는 -1을 추가
        else: # 만약 이미 있다면
            lastIdx = s[:i].rindex(s[i]) # 탐색의 진행상황을 통해 원본 문자열으로 가서 마지막 인덱스 계산
            answer.append(i - lastIdx) # answer 배열에 i - lastIdx를 빼준다
    
    return answer