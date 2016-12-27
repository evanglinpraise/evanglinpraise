#include <stdio.h>

int main() {
	int f=1,n,i;
	printf("enter the number");
	scanf("%d",&n);
	for(i=1;i<=n;i++){
	f=f*i;
	}
	printf("the factorial is %d",f);
	return 0;
}
