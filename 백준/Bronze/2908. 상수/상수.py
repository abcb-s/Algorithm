# 입력
a, b = input().split()

# 문자열을 뒤집고 정수로 변환
rev_a = int(a[::-1])
rev_b = int(b[::-1])

# 둘 중 큰 수 출력
print(max(rev_a, rev_b))