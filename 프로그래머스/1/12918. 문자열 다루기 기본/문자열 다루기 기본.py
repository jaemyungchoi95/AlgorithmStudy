def solution(s):
    if s.isdigit() and len(s) in (4,6):
        return True
    else:
        return False