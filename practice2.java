import java.util.Scanner;
import java.lang.ArithmeticException;
public class practice2{
	public static void main(String[]args) throws ArithmeticException{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a");
		int a=sc.nextInt();
		System.out.println("Enter b");
		int b=sc.nextInt();
		try{

			if (b==0) {
				throw new ArithmeticException("machoday gyyy....");
			}
		int ans=(a/b);
		}
		
		finally{
			System.out.println("revdi");
		}
	}
}