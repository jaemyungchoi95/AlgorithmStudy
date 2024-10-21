def solution(id_list, report, k):
    reportArr = [] # 신고내용 재가공 [i][0] : 신고자, [i][1] : 피신고자
    reportCtn = [0] * len(id_list) # 유저별 신고당한 횟수를 저장하는 배열
    result = [0] * len(id_list) # 신고메일 받은 횟수를 저장하는 배열
    
    # 리스트 내에 중복 신고건이 있으면 해당 항목은 리스트에서 제거
    report = list(set(report))
    
    # # 신고내용을 분리한다.
    for i in range(len(report)):
        reportArr.append(report[i].split()) # 분리된 형태의 리스트를 새로 담아준다.

    # 신고내용을 처리해준다.
    for i in reportArr:
        reportCtn[id_list.index(i[1])] += 1 # id_list에서 신고당한 사람의 인덱스 번호 추출하여, 해당 인덱스에 1을 더해준다.
    
    for i in range(len(reportArr)):
        if reportCtn[id_list.index(reportArr[i][1])] >= k:
            result[id_list.index(reportArr[i][0])] += 1
    
    return result