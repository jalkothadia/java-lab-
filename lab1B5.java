import java.util.Scanner;

public class lab1B5{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of Meter");
		int meter=sc.nextInt();

		double feet=meter*3.2028;

		System.out.println("the value in feet is ="+feet);
	}
}