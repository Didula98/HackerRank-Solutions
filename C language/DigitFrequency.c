#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    char num[1000];
    char result[10] = {0};
    scanf("%s", num);
    for(int i = 0; num[i] != '\0'; i++){
        if(num[i] > 47 && num[i] < 58){
            result[num[i]-48]++;
        }
    }  
    
    for(int i = 0; i < 10; i++){
        printf("%d ", result[i]);
    }
    return 0;
}
