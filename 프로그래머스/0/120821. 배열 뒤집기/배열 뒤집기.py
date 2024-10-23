def solution(num_list):
    for i in range(len(num_list)//2): # 배열의 길이가 짝수면 전부 1:1, 홀수면 가운데 빼고 1:1 대응하는정도로만 돌면서
        num_list[i], num_list[len(num_list)-1-i] = num_list[len(num_list)-1-i], num_list[i] # 첫번째는 마지막번째랑, 두번째는 그 전 인덱스랑 바꿔줌
    
    return num_list