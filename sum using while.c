#include<stdio.h>
int main()
{
    int n=1,sum=0,l;
    printf("enter the limit");
    scanf("%d",&l);
    while(n<l){
        sum+=n;
        n++;
    }
    printf("the sum is :%d",sum);

   return 0;
}
