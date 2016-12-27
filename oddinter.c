#include<stdio.h>
int main()
{
    int n,i;
    printf("enter odd num till:");
    scanf("%d",&n);
    printf("\n odd num  from 1 to %d are: \n",n);
    for(i=1;i<=n;i=i+2)
    printf("%d \n",i);
    return 0;
}



