#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int sumofDigits(int);
int main() {
	
    int n;
    scanf("%d", &n);
    //Complete the code to calculate the sum of the five digits on n.
    printf("%d\n", sumofDigits(n));
    return 0;
}

int sumofDigits(int num){
    int sum = 0;
    int digit;
    
    for(int i = 0; i < 5; i++){
        digit = num % 10;
        sum += digit;
        num /= 10;
    }
    
    return sum;
}
