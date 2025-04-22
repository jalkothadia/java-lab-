import java.util.Scanner;

public class practice{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int matrix[][]=new int[3][3];

		for(int i=0;i<3;i++){
			for(int j=0;j<3;i++){
				matrix[i][j]=sc.nextInt();
			}
		}

		for(int i=0;i<3;i++){
			for(int j=0;j<3;i++){
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}


	}
}