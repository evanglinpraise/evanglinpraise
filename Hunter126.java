package guvi;

import java.util.Scanner;

public class Hunter126 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int count=0;
		System.out.println("enter the number to search");
		int k=sc.nextInt();
		for(int i=0;i<n;i++){
			if(k==a[i]){
				count++;
			}
		}
		System.out.println(count);
		System.out.println(k);
	}

}
