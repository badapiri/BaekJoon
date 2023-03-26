A, B = map(int, input().split()) 
buk = []
for a in range(A):
    buk.append(a + 1)
for b in range(B):
    c, d = map(int, input().split())
    tempo = buk[c - 1]
    buk[c - 1] = buk[d - 1]
    buk[d - 1] = tempo
for i in buk:
    print(i, end=" ")
