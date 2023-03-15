if __name__ == '__main__':
  n = int(input())
  l = []
  l1 = []
  l2 = []
  for i in range(n):
    name = input()
    mark = float(input())
    l.append([name,mark])
  for j in l:
    l1.append(j[1])
  l1 = list(dict.fromkeys(sorted(l1)))
  

  for h in l:
    if h[1] == l1[1]:
      l2.append(h[0])
  l2.sort()
  for i in l2:
    print(i)