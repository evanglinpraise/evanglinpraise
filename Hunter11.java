package begginer;

import java.util.Scanner;

public class Hunter11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String out="";
		String[] arr=str.split(" ");
		for(int i=arr.length-1;i>=0;i--){
			out=out+arr[i]+" ";
		}
		System.out.println(out);

}
}
