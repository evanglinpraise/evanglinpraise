package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class Pro2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		//char [] chars = String.valueOf(n).toCharArray();
		 //int[] a = new int[String.valueOf(n).length()];
		 for(int i=0;i<n;i++){
			 a[i]=sc.nextInt();
		 }
		 Arrays.sort(a);
		 for(int i=0;i<n-k;i++){
			 System.out.print(a[i]);
		 }
	}

}
