H, M = map(int, input().split())
A = int(input())
L = H * 60 + M + A
H = L / 60
M = L % 60
H = int(H)
M = int(M)
if H >= 24:
    H = H - 24
print(H, M)