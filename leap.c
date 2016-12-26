#include<stdio.h>
int main()
{

    int a;
    printf("enter the year");
    scanf("%d",&a);
    if(a%4||a%100==0)
    {
        printf("it is leap year");
    }else{
    printf("it is not leap year");
    }
    return 0;
}

