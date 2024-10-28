def solution(id_pw, db):
    answer = ''
    
    for i in db:
        if i[0] == id_pw[0]: # id부터 확인 : 맞으면
            if i[1] == id_pw[1]: # 비번 맞으면
                answer = 'login'
                break
            else: # 비번 틀리면
                answer = 'wrong pw'
                break
        else: # id부터 확인 : 틀리면
            answer = 'fail'
            
    return answer