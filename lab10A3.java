import java.util.Scanner;

class DarshanUniException extends Exception{
	public DarshanUniException(String S){
		System.out.println("Darshan Exception");
		super(S);
	}
}

public class lab10A3{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int balance=5000;
		System.out.println("Enter withdraw amount");
		int withdraw=sc.nextInt();

		try{
			if(balance-withdraw<1000){
				throw new DarshanUniException();
			}else{
				System.out.println("balance is = "+(balance-withdraw));
			}
		}catch(Exception e){
			e.DarshanUniException();
		}
	}
}