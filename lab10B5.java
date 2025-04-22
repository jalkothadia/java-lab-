import java.util.Scanner;

public class lab10B5{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		System.out.println("Number is = "+n);
	
			try{
				if(10<n && 50>n){
				System.out.println("Square is = "+(n*n));
			}
				else{
					throw new Exception("Not a Valid Number");
				}
		}
		catch(Exception e){
			 e.printStackTrace();
		}
	}	
}

