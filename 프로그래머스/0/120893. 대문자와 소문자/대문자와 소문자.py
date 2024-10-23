def solution(my_string):
    temp = []
    
    # 대문자 아스키코드 65 ~ 90
    # 소문자 아스키코드 97 ~ 122 -> 32씩 차이나게 1:1 대응 가능
    # ord(a) = 65 / chr(65) = a
    
    for i in my_string:
        temp.append(i)
    
    for i in range(len(temp)):
        if 65 <= ord(temp[i]) <= 90: # 만약 i의 아스키코드가 대문자에 해당한다면
            temp[i] = temp[i].lower()
        else: # 해당하지 않는다면
            temp[i] = temp[i].upper()
    
    return ''.join(temp)