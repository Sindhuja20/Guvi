#include <stdio.h>
int main(void) {
	int a[10],b[10],sum[10];
	int i;
  printf("\n Enter the integer array values for a:");
  for(i=0;i<10;i++)
  scanf("%d",&a[i]);
   printf("\n Enter the integer array values for b:");
  for(i=0;i<10;i++)
  scanf("%d",&b[i]);
   for(i=0;i<10;i++)
 sum[i]=a[i]+b[i];
 printf("\n Sum of array is :");
 for(i=0;i<10;i++)
 printf("\t%d",sum[i]);
 	return 0;
}
