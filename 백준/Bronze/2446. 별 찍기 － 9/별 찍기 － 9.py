a = int(input())  # a = 5 라고 가정

# 위쪽 역삼각형 (중앙 포함)
for i in range(a, 0, -1):
    print(" " * (a - i) + "*" * (2 * i - 1))

# 아래쪽 정삼각형 (중앙 제외)
for i in range(2, a + 1):
    print(" " * (a - i) + "*" * (2 * i - 1))