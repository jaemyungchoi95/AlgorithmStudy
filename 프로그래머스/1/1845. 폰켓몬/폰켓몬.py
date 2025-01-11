def solution(nums):
    pick = len(nums)/2 # 고를 수 있는 포켓몬 수
    reNum = set(nums) # set을 이용하여 중복된 포켓몬의 수를 제거
    
    return min(pick, len(reNum)) # 고를 수 있는 포켓몬의 수와 포켓몬 종류 중 더 낮은 값을 반환