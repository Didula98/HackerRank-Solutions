def count_substring(string, sub_string):
  j = 0
  for i in range(len(string)-len(sub_string)+1):
    if list(string)[i:i+len(sub_string)] == list(sub_string):
      j += 1
    
  return j

