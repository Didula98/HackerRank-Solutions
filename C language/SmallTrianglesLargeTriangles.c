#include <stdio.h>
#include <stdlib.h>
#include <math.h>

struct triangle
{
	int a;
	int b;
	int c;
};

typedef struct triangle triangle;

void sort_by_area(triangle* tr, int n) {
	/**
	* Sort an array a of the length n
	*/
    double squares[n];
    for(int i = 0; i < n; i++){
        double p = (tr[i].a + tr[i].b + tr[i].c)/2.0;
        double square = pow(p*(p- tr[i].a)*(p-tr[i].b)*(p-tr[i].c), 0.5);
        squares[i] = square;
    }
    
    for(int i = 0; i < n; i++){
        for(int j = i+1; j < n; j++){
            if(squares[i] > squares[j]){
                double temp = squares[i];
                triangle temp_tr = tr[i];
                
                squares[i] = squares[j];
                tr[i] = tr[j];
                
                squares[j] = temp;
                tr[j] = temp_tr;
            }
        }
    }
}


int main()
{
	int n;
	scanf("%d", &n);
	triangle *tr = malloc(n * sizeof(triangle));
	for (int i = 0; i < n; i++) {
		scanf("%d%d%d", &tr[i].a, &tr[i].b, &tr[i].c);
	}
	sort_by_area(tr, n);
	for (int i = 0; i < n; i++) {
		printf("%d %d %d\n", tr[i].a, tr[i].b, tr[i].c);
	}
	return 0;
}