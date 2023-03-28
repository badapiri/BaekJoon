A_list = list(range(1, 31))

for i in range(28):
    A = int(input())
    A_list.remove(A)
    
print(A_list[0])
print(A_list[1])