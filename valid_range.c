#include <stdio.h>
int main(void) {
	int n,i;
	printf("\n Enter the integer value between 1 too 10:");
	scanf("%d",&n);
	if(n>0 && n<10)
	printf("\n Given input is within the range");
	else
	printf("\n Given input is not in range enter between 1 to 10");
	 	return 0;
}
