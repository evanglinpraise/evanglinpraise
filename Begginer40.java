package begginer;
import java.util.Scanner;
public class Begginer40
{
    public static void main(String[] args) 
    {
       int n,n1=0,n2=0,n3=1;
        Scanner s = new Scanner(System.in);
        n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;
            System.out.print(n1+" ");
        }
    }
}

