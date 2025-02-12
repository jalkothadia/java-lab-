import java.util.Scanner;

public class lab3a4
{
	public static void main(String[]args){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter 1 number");
	int a=sc.nextInt();
	System.out.println("Enter 2 number");
	int b=sc.nextInt();
	System.out.println("Enter 3 number");
	int c=sc.nextInt();

	(a>b)?((a>c)?(System.out.println("maximum"+a)):((System.out.println("maximum"+c))):((b>c)?(System.out.println("maximum"+a)):(System.out.println("maximum"+b))))

}
}