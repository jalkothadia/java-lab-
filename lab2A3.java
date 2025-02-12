import java.util.Scanner;
public class lab2A3
{
	public static void main(String[]args){
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the length");
			int len=sc.nextInt();
			System.out.println("enter the breath");
			int bre=sc.nextInt();

			System.out.println("area is"+(len*bre));
	}
}