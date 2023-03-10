#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

char * InttoStr(int);

int main() 
{
    int a, b;
    scanf("%d\n%d", &a, &b);
  	// Complete the code.
 
    for(int i = a; i <= b; i++){
        printf("%s\n", InttoStr(i));
    }

    return 0;
}

char * InttoStr(int i){
    if(i <= 9){
        switch (i) {
        case 1: return "one";
        case 2: return "two";
        case 3: return "three";
        case 4: return "four";
        case 5: return "five";
        case 6: return "six";
        case 7: return "seven";
        case 8: return "eight";
        case 9: return "nine";
        }
    }else{
        if(i % 2 == 0){
            return "even";
        }else{
            return "odd";
        }
    }
    
    return "";
}