#include<stdio.h>
int main()
{

    int n,sum=0,l;
    printf("enter the limit");
    scanf("%d",&l);
    for(n=1;n<l;n++)
        {
     sum+=n;
    }
    printf("the sum is %d",sum);
    return 0;
}
