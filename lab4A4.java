import java.util.Scanner;

public class lab4A4{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String str=sc.nextLine();

		System.out.println("length of String is="+str.length());

		for(int i=0;i<str.length()/2;i++){
			System.out.print(str.charAt(i));
		}
	}
}
