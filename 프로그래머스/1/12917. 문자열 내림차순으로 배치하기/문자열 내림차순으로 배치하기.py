def solution(s):
    tempArr = []; # 임시 배열
    
    # 리스트 상 문자열의 아스키코드를 임시배열에 담아준다.
    [tempArr.append(ord(i)) for i in s]
    
    # 임시배열을 역순으로 정렬해준다.
    tempArr.sort(reverse = True)
            
    # 다시 리스트를 문자열로 합쳐준다.
    return ''.join([chr(i) for i in tempArr])