#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
//Complete the following function.


void calculate_the_maximum(int n, int k) {
  //Write your code here.
  int maxAnd = 0, maxOr = 0, maxXOr = 0;
  
  for(int i = 1; i <= n; i++){
      for(int j = i+1; j <= n; j++){
          
        int a = i & j;
        int b = i | j;
        int c = i ^ j;

        if (a < k && maxAnd < a) {
            maxAnd = a;
        }
        if (b < k && maxOr < b) {
            maxOr = b;
        }
        if (c < k && maxXOr < c) {
            maxXOr = c;
        }        
        
      }
  }
  
  printf("%d\n%d\n%d\n", maxAnd, maxOr, maxXOr);
}

int main() {
    int n, k;
  
    scanf("%d %d", &n, &k);
    calculate_the_maximum(n, k);
 
    return 0;
}