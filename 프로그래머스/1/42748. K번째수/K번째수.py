def solution(array, commands):
    answer = []
    temp = []
    
    # array 입력값은 배열로 들어온다
    # commands에 2차원 배열로 들어오는데, 2차원은 [i, j, k]
    # i = 인덱스 시작, j = 인덱스 끝, k = 정렬 후 k번때 숫자 출력
    
    for x in range(len(commands)): # 주어지는 commands만큼의 전체 동작을 위해 선언
        i, j, k = commands[x][0], commands[x][1], commands[x][2] # 변수값을 따로 받아줌
        temp = array[i-1:j] # i 부터 j번 인덱스까지 슬라이싱하여 임시배열에 담아준다.
        temp.sort() # 오름차순 정렬
        answer.append(temp[k-1])
        print(temp)
        
    
    return answer