N, X = map(int, input().split())
A = [ * map(int, input().split())]
B = []
for i in range(len(A)):
    x = A[i]
    if x < X:
        B.append(A[i])
print(* B)