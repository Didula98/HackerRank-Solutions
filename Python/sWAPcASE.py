def swap_case(s):
    s2 = ""
    for c in s:
        if c.isupper():
            s2+=c.lower()
        else:
            s2+=c.upper()
        
    return s2