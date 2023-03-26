A = int(input())
i = 0
for i in range(A - 1):
    A = (A + i)
    i += 1
    ans = A + i 
if A == 1:
    print(1)
else:
    print(ans)