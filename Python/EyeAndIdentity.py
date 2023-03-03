import numpy
numpy.set_printoptions(precision=4, legacy='1.13')
#import numpy.set_printoptios(legacy='1.13')
n,m = input().strip().split()
n,m = int(n),int(m)
print(numpy.eye(n,m))