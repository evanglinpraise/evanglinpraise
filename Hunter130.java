package begginer;

import java.util.Scanner;

public class Hunter130 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		if(str.equals("sunday")||str.equalsIgnoreCase("Sunday")){
			System.out.println("false");
		}
		else if(str.equals("saturday")||str.equalsIgnoreCase("Saturday")){
			System.out.println("false");
		}
		else{
			System.out.println("True");
		}
	}

}
