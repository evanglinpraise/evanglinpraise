#include<stdio.h>
int main()
{
char ch;
printf("enter the char");
scanf("%c",&ch);
if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))-
{
printf("it is alphabet");
}
else{
printf("it is digit");
}
return 0;
}
