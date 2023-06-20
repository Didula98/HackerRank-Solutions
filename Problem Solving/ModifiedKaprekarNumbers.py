#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'kaprekarNumbers' function below.
#
# The function accepts following parameters:
#  1. INTEGER p
#  2. INTEGER q
#

def kaprekarNumbers(p, q):
    # Write your code here
    flag = 0
    for i in range(p, q+1):
        squre = pow(i, 2)
        digits = len(str(i))
        
        if(i == 1):
            print(i, end = ' ')
            flag = 1
        if(squre > 9):
            if((int(str(squre)[digits*-1:]) + int(str(squre)[:digits*-1])) == i):
                flag = 1
                print(i, end = ' ')

    if(flag == 0):
        print("INVALID RANGE")
if __name__ == '__main__':
    p = int(input().strip())

    q = int(input().strip())

    kaprekarNumbers(p, q)
