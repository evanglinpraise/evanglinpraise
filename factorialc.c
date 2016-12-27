#include <stdio.h>

int main() {
	int o=1,n,j;
	printf("enter the number");
	scanf("%d",&n);
	for(j=1;j<=n;j++){
	o=o*j;
	}
	printf("the factorial is %d",o);
	return 0;
}
