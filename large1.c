
#include<stdio.H>
int main()
{
   int m,n,o;
   printf("enter the three numbers");
   scanf("%d%d%d",&m,&n,&o);
   if(m>n&&m>o)
   printf(" m is the largest number");
   else if(n>o)
   printf("n is the largest number");
   else
   printf("o is the largest number");
   return 0;
   }
