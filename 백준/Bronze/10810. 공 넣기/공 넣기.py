A, B = map(int, input().split()) 
buk = []
for a in range(A):
    buk.append(0)
for b in range(B):
    c, d, f = map(int, input().split()) 
    for g in range(c-1, d):
        buk[g] = f
for i in buk:
    print(i, end=" ")