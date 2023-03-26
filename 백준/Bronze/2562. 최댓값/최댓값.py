import sys
A = [int(sys.stdin.readline().rstrip()) for i in range(9)]
max = 0
for idx, i in enumerate(A):
    if max < i:
        max = i
        num = idx
print(f"{max}\n{num + 1}")