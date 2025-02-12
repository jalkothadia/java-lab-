import java.util.Scanner;

public class lab3a
{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter marks of sub1");
		int mark1=sc.nextInt();
		System.out.println("enter marks of sub2");
		int mark2=sc.nextInt();	
		System.out.println("enter marks of sub3");
		int mark3=sc.nextInt();
		System.out.println("enter marks of sub4");
		int mark4=sc.nextInt();
		System.out.println("enter marks of sub5");
		int mark5=sc.nextInt();
		
		int sum=mark1+mark2+mark3+mark4+mark5;

		float per=(float)(sum*100)/500;
		System.out.println("percentage is"+per);

		if(per>=60){
			System.out.println("first division");
		}
		else if(per>50 && per<=59){
			System.out.println("second division");
		}
		else if(per>40 && per<=49){
			System.out.println("third division");
		}
		else if(per<40){
			System.out.println("fail");
		}
	}
}




