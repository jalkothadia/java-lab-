import java.util.Scanner;

public class lab5C{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();

		int[] a1=new int[n];
		int[] a2=new int[n];

		for(int i=0;i<n;i++){
			System.out.println("enter the"+i+"element of array1");
			a1[i] =sc.nextInt();
		}
		System.out.println("Enter pivot index");
		int pivot=sc.nextInt();
		int j=0;

		for(int i=0;i<pivot;i++){
			a2[j++]=a1[i+pivot];
		}
		for(int i=pivot;i<n;i++){
			a2[j++]=a1[i-pivot];
		}
		for(int i=0;i<n;i++){
			System.out.print(" "+a2[i]);
		}
		System.out.println();
		System.out.print("Enter the target:");
		int target=sc.nextInt();

		for(int i=0;i<n;i++){
			if(target==a2[i]){
				System.out.println(i);
				break;
			}
			else{
				System.out.println("-1");
				break;
			}
		}
	}
}