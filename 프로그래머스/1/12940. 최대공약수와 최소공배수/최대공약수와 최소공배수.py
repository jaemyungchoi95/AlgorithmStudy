def solution(n, m):
    # 유클리드 호제법으로 최대공약수 구하기
    def gcd(a, b):
        while b:
            a, b = b, a % b
        return a
    
    # 최대공약수
    gcd_value = gcd(n, m)
    
    # 최소공배수
    lcm_value = (n * m) // gcd_value
    
    return [gcd_value, lcm_value]