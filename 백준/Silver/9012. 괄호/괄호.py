# 9012번: 괄호
# 자료구조: 스택
# 난이도: 하

t = int(input())  # 테스트 케이스 개수 입력
for _ in range(t):
    s = input().strip()  # 괄호 문자열
    stack = []
    valid = True  # 유효성 판별 변수
    
    for ch in s:
        if ch == '(':
            stack.append(ch)
        else:  # ')'일 때
            if not stack:  # 스택이 비어있으면 짝이 안 맞음
                valid = False
                break
            stack.pop()  # 짝 맞으면 하나 제거
    
    # 다 돌고 나서 스택에 남아있으면 올바르지 않음
    if stack:
        valid = False
    
    print("YES" if valid else "NO")