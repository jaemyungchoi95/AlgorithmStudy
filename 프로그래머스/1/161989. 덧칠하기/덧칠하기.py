def solution(n, m, section):
    count = 0  # 롤러로 칠하는 횟수
    location = 0  # 롤러의 마지막 위치
    
    # 칠이 필요한 구역을 탐색하면서
    for i in section:
        # 롤러가 해당 구역을 덮지 못하면 새로운 칠 작업 시작
        if i > location:
            count += 1  # 칠하는 횟수 증가
            location = i + m - 1  # 롤러로 덮는 마지막 위치 갱신
            
    return count