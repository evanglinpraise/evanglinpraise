#include<stdio.h>
int main()
{
  int m,re=0,rm;
  printf("enter the number");
  scanf("%d",&m);
  while(m!=0)
  {
      rm=m%10;
      re=re*10+rm;
      m=m/10;

  }
  printf("the value is %d",re);
  return 0;
}
