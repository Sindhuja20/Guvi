#include <stdio.h>
int main(void) {
	int n,i;
	printf("\n Enter the table number:");
	scanf("%d",&n);
	for(i=1;i<=10;i++)
	{
	    printf("\n %d * %d =%d",i,n,i*n);
	}
 	return 0;
}
