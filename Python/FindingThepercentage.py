if __name__ == '__main__':
   n = int(input())
   dic= {}
   for i in range(n):
    l = input().strip().split()

    dic[l[0]] = list(map(float,l[1:]))

   k = input()
   print('%.2f'%(sum(dic[k])/len(dic[k])))