#include <stdio.h>
int main(void) {
char a[10],b[10];
int i,j=1;
printf("\n Enter string1:");
scanf("%s",a);
printf("\n Enter string2:");
scanf("%s",b);
    for(i=0;i<10;i++)
    {
        if(a[i]!=0||b[i]!=0)
        {
if(a[i]==b[i])
{
       j=1;
}
else
{
    j=2;
    break;
}
}
else
break;

}
if(j==1)
printf("\n Given strings are equal");
else
printf("\n Given strings are not equal");
	 	return 0;
}
