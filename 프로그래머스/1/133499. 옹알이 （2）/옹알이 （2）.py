def solution(babbling):
    possible = ["aya", "ye", "woo", "ma"]  # 발음 가능한 단어들
    count = 0  # 발음 가능한 단어 개수

    for word in babbling:
        for p in possible:
            # 연속된 같은 발음을 방지하기 위해 p+p를 먼저 처리
            if p*2 in word:
                break
            # 가능한 단어는 공백으로 대체
            word = word.replace(p, " ")
        # 공백으로 대체된 결과가 전부 공백이면 발음 가능
        if word.strip() == "":
            count += 1

    return count