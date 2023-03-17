if __name__ == '__main__':
  k = int(input())

l = []
for i in range(k):
  n = input().strip().split()
  m = list(map(int,n[1:]))

  if n[0] == 'print':
    print(l)
  elif n[0] == 'append':
    l.append(m[0])
  elif n[0] == 'insert':
    l.insert(m[0],m[1])
  elif n[0] == 'remove':
    l.remove(m[0])
  elif n[0] == 'sort':
    l.sort()
  elif n[0] == 'pop':
    l.pop()
  else:
    l.reverse()