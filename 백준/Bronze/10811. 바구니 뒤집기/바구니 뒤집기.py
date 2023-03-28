N,M = map(int,input().split())
A = list(map(int, range(1, N+1)))
for i in range(M):
    X,Y = map(int,input().split())
    if X-1 == 0:
        A[X-1:Y] = A[Y-1::-1]
    else:
        A[X-1:Y] = A[Y-1:X-2:-1]
print(*A)