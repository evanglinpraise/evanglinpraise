#include<stdio.h>
int main()
{
    int n,i;
    printf("enter even num till:");
    scanf("%d",&n);
    printf("\n even num  from 1 to %d are: \n",n);
    for(i=0;i<=n;i=i+2)
    printf("%d \n",i);
    return 0;
}



