import java.util.Scanner;
public class lab4A3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("enter size of array");
		int[] arr=new int[n];

		for(int i=0;i<n;i++){
			System.out.println("enter value");
			arr[i]=sc.nextInt();
		}
		for(int i=n-1;i>=0;i--){
			System.out.println(arr[i]);
		}
	}
}