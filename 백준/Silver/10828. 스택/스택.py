import sys
input = sys.stdin.readline

class ArrayStack:
    def __init__(self):
        self.stack = []
    def push(self, item):
        self.stack.append(item)
    def pop(self):
        if not self.is_empty():
            return self.stack.pop()
        return -1
    def size(self):
        return len(self.stack)
    def is_empty(self):
        return len(self.stack) == 0
    def top(self):
        if not self.is_empty():
            return self.stack[-1]
        return -1

n = int(input())
stack = ArrayStack()

for _ in range(n):
    cmd = input().split()
    if cmd[0] == "push":
        stack.push(int(cmd[1]))
    elif cmd[0] == "pop":
        print(stack.pop())
    elif cmd[0] == "size":
        print(stack.size())
    elif cmd[0] == "empty":
        print(1 if stack.is_empty() else 0)
    elif cmd[0] == "top":
        print(stack.top())