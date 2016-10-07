#include<stdio.h>


int main()
{
    int n1,n2,i,j,count=0;
    printf("Enter the range from _________ to __________");
    scanf("%d%d",&n1,&n2);
    for(i=n1;i<=n2;i++)
    {
        count=0;
        for(j=1;j<=i;j++)
        {
            if(i%j==0)
                count++;
        }
            if(count==2)
            {
                printf("\n%d",i);

            }
    }
    return 0;
}
