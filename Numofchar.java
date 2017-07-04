package begginer;

import java.util.Scanner;

public class Numofchar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int  c=0;
		for(int i=0;i<s.length();i++){
			c++;
		}
		System.out.println(c);
	}

}
