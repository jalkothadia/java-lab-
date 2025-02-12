import java.util.Scanner;
public class lab2A2
{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		Scanner str=new Scanner(System.in);

		System.out.println("Enter number 1");
		int a=sc.nextInt();
		System.out.println("Enter number 2");
		int b=sc.nextInt();
		System.out.println("enter the process");
		String str=str.nextLine();

		if(str == "+"){
			System.out.println("ans is"+ (a+b) );
		}
	}
}