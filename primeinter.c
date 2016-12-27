#include<stdio.h>
int main()
{
    int n,m;
    printf("\n prinme  num b/w 1 to 100 \n");
    for(n=3;n<=100;n++)
    {
      for(m=2;m<=100;m++)
        {
            if(n%m==0)
                break;
        }
        if(m==n)
            printf("%d\n",n);
    }
    return 0;
}
