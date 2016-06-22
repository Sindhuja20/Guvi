#include <stdio.h>
int main(void) {
	int n,i=0,sum=0;
  printf("\n Enter the integer value:");
  scanf("%d",&n);
  if(i<n)
  {
    sum=sum+i;
    i++;
  }
  printf("\n Sum of %d numbers is %d",n,sum);
	return 0;
}
