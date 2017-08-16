package guvi;
import java.util.Scanner;

public class Hunter127 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		for(int n=2;n<=num;n++){
		int flag=0;
		for(int i=2;i<n/2;i++){
			if(n%i==0){
				flag=1;
				break;
			}
		}
		if(flag==0&&n%10==3){
		sum+=n;
		}
	}
		System.out.println(sum);
}
}
