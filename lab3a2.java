import java.util.Scanner;

public class lab3a2
{
	public static void main(String[]args){
		Scanner sc=new Scanner(Systen.in);
		System.out.println("enter a number");
		int num=sc.nextInt();

		if(num%2==0){
			System.out.println("number is even");
		}
		else{
			System.out.println("number is odd");
		}

	}
}