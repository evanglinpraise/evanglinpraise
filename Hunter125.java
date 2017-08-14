package guvi;

import java.util.Scanner;

public class Hunter125 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		for(int i=0;i<=s.length();i++){
			for(int j=i+2;j<=s.length();j++){
				if(s.substring(i,j).equals((new StringBuffer(s.substring(i,j)).reverse()).toString())){
					System.out.println(s.substring(i,j));
				}
			}
		}
	}

}

