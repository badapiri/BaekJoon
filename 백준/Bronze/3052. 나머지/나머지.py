A = []
for i in range(10):
    A.append(int(input()))
    A[i]= A[i] % 42
B = set(A)
print(len(B))