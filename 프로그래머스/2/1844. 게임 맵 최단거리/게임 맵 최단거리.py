def solution(maps):
    queue = []
    queue.append([0, 0])

    dx = [-1,0,1,0] # 상하방 탐색
    dy = [0,1,0,-1] # 좌우측 탐색
    
    n, m = len(maps[0]) , len(maps) # 가로 : n , 세로 : m
    
    visited = [[False for _ in range(n)] for _ in range(m)] # 방문여부 체크
    counted = [[1 for _ in range(n)] for _ in range(m)] # 방문 후 이동하는 경로상 거리 카운트
    visited[0][0] = True
    
    while queue:
        x, y = queue.pop(0)
        
        if x == n-1 and y == m-1:
            return counted[y][x]

        for i in range(4): # 4방향을 탐색하기 위한 반복문
            if 0 <= x+dx[i] < n and 0 <= y+dy[i] < m: # 상하좌우 축의 범위가 인덱스를 벗어나는 것을 방지하기 위해 검사
                if maps[y+dy[i]][x+dx[i]] == 1 and not visited[y+dy[i]][x+dx[i]]:
                    counted[y+dy[i]][x+dx[i]] = counted[y][x]+1
                    queue.append([x+dx[i], y+dy[i]])
                    visited[y+dy[i]][x+dx[i]] = True

    if x != n-1 or y != m-1:
        return -1