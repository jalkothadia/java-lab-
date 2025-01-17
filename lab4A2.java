import java.util.Scanner;
public class lab4A2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a size of array");
		int n=sc.nextInt();
		int[] array=new int[n];
		for(int i=0;i<n;i++){
			System.out.println("enter value");
			array[i]=sc.nextInt();
		}
		int total=0;
		for(int i=0;i<n;i++){
			total=total+array[i];
		}
		System.out.println("total is"+total);

		System.out.println("avg is"+(total/n));
	}
}