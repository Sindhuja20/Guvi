#include<stdio.h>

int main()
{
    char str[50],i;
    printf("Enter the sentence:");
    scanf("%[^\t]s",str);
    for(i=0;str[i]!='\0';i++)
    {
        if(str[i-1]==' ' || i==0)
        {
            if(str[i]>='a' && str[i]<='z')
                str[i]=str[i]-32;
        }
        else
        {
            if(str[i]>='A' && str[i]<'Z')
                str[i]=str[i]+32;
        }
    }
    printf("\n%s",str);
    return 0;
}
