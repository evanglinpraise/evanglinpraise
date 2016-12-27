#include<stdio.h>
int main()
{
    int n,i,c=0;
    printf("\n enter the number");
    scanf("%d",&n);
    for(i=2;i<=n/2;i++)
    {
        if(n%1==0)
        {
            c++;
        }
    }
    if(c==0&&n!=1)
    {
        printf("\n the num is prime");
    }
    else
    {
        printf("\n num is not prime");
    }
    return 0;
}

