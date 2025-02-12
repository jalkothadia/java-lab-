import java.util.Scanner;

public class lab6A{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the radius of circle");
		double radius=sc.nextDouble();

		double area=(3.14*radius*radius);

		System.out.println("area is"+area);
		
	}
}
