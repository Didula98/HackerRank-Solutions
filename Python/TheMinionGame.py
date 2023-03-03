def minion_game(string):
    # your code goes here
    l = len(string)
    con = 0
    vow = 0
    for i in range(l):
        if string[i] in 'AEIOU':
            vow += l-i
        else:
            con += l-i
    
    
    if vow < con:
        print('Stuart ' + str(con))
    elif vow > con:
        print('Kevin ' + str(vow))
    else:
        print('Draw')
            