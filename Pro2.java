package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class Pro2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] num=new int[n];
		for(int i=0;i<n;i++){
			 num[i]=sc.nextInt();
		}
		Arrays.sort(num);
		int k=sc.nextInt();
		for(int i=0;i<n-k;i++){
			System.out.print(num[i]);
		}
	}

}
