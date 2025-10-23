# 스택 자료구조를 이용한 탑 문제 해결
# 스택에는 (탑의 높이, 탑의 인덱스)를 저장한다.

n = int(input())                   # 탑의 개수 입력
heights = list(map(int, input().split()))  # 각 탑의 높이
stack = []                         # 스택 초기화
result = []                        # 결과 저장 리스트

for i in range(n):                 # 각 탑을 순회
    height = heights[i]

    # 현재 탑보다 낮은 탑들은 신호를 못 받으므로 스택에서 제거
    while stack and stack[-1][0] <= height:
        stack.pop()

    # 스택이 비었다면 수신할 탑이 없음
    if not stack:
        result.append(0)
    else:
        # 스택의 top에 있는 탑이 현재 탑의 신호를 수신
        result.append(stack[-1][1])

    # 현재 탑을 스택에 push (높이, 인덱스)
    stack.append((height, i + 1))

# 결과 출력
print(" ".join(map(str, result)))