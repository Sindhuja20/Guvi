#include <stdio.h>
int main(void) {
char a[20],b[20];
printf("\n Enter string1:");
scanf("%s",a);
printf("\n Enter string2:");
scanf("%s",b);
if(strcmp(a,b)==0)
printf("\n Given strings are equal");
else
printf("\n Given strings are not equal");
	 	return 0;
}
