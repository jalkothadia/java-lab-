import java.util.Scanner;

public class lab10A1{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of students");
		int n=sc.nextInt();
		int [] student=new int[5];
		int total=0;
		try{
			for(int i=0;i<n;i++){
				total+=student[i];
			}
			int avg=total/n	;
			}

	
			
		catch(ArithmeticException e){
			System.out.println("ArithmeticException");
		}
		catch(ArrayIndexOutOfBoundsException ei){
			System.out.println("ArrayIndexOutOfBoundsException");
		}
	}
}