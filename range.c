#include <stdio.h>
int main(void) {
	int n;
  printf("\n Enter the integer value between 1 to 9:");
  scanf("%d",&n);
 if(n<=0||n>=10)
 {
     printf("\n Range exceeds Enter the value between the range 1 to 9");
 }
 else
 {
     printf("\n value is accepted");
 }
	return 0;
}
