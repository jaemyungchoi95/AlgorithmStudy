def solution(answers):
    persons = [[1, 2, 3, 4, 5],[2, 1, 2, 3, 2, 4, 2, 5],[3, 3, 1, 1, 2, 2, 4, 4, 5, 5]]
    
    scores = []
    for p in persons :
        print(p)
        cnt = 0
        for idx, i in enumerate(answers):
            if p[idx%len(p)]==i : cnt += 1
        scores.append(cnt)
    
    return [idx+1 for idx,s in enumerate(scores) if s==max(scores)]
 