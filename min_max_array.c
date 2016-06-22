#include <stdio.h>
int main(void) {
	int a[10],i,j;
	int max,min;
  printf("\n Enter the integer array values for a:");
  for(i=0;i<10;i++)
  scanf("%d",&a[i]);
  max=a[0];
  min=a[0];
     for(i=0;i<10;i++)
 {
     for(j=1;j<10;j++)
     {
         if(a[i]>a[i])
         max=a[i];
         else
         min=a[i];
     }
 }
 printf("\n Largest of an given array is %d",max);
 printf("\n Smallest of an array is %d",min);
 	return 0;
}
