#include<stdio.h>
#include<string.h>
int main()
{
    char str[100];
    char *rev;
    printf("enter the string:");
    scanf("%s",&str);
   rev=strrev(str);
   printf("the rev string is/n %s",str);
    return 0;
}
