import numpy as np
N,M,P = input().strip().split()
N,M,P = int(N),int(M),int(P)
array1 = []
array2 = []
for i in range(N):
    list1 = list(map(int,input().strip().split()))
    array1.append(list1)
for j in range(M):
    list2 = list(map(int,input().strip().split()))
    array2.append(list2)
array_1 = np.array(array1)
array_2 = np.array(array2)
print(np.concatenate((array_1, array_2), axis = 0))