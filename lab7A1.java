import java.util.Scanner;

class Student{
	int id_no;
	int no_of_sub;
	String[] sub_code;
	int[] sub_credit;
	String[] grade_obtain;
	double spi;

	Student(int id_no,int no_of_sub,String[]sub_code,int[]sub_credit,String[]grade_obtain){
		this.id_no=id_no;
		this.no_of_sub=no_of_sub;
		this.sub_code=sub_code;
		this.sub_credit=sub_credit;
		this.grade_obtain=grade_obtain;
		
	}

		public int grade(String grade_obtain){
		if(grade_obtain.equals("A+")){
			return 10;
		}
		else if(grade_obtain.equals("A")){
			return 9;
		}
		else if(grade_obtain.equals("B+")){
			return 8;
		}
		else if(grade_obtain.equals("B")){
			return 7;
		}
		else if(grade_obtain.equals("C+")){
			return 6;
		}
		else if(grade_obtain.equals("C")){
			return 5;
		}
		else if(grade_obtain.equals("D+")){
			return 4;
		}
		else if(grade_obtain.equals("D")){
			return 3;
		}
		else if(grade_obtain.equals("E+")){
			return 2;
		}
		else if(grade_obtain.equals("E")){
			return 1;
		}
		else{
			return 0;
		}
	}
	public void SPI(){
		int total_point=0,total_credit=0;

		for(int i=0;i<no_of_sub;i++){
			total_credit+=sub_credit[i];
			total_point+=sub_credit[i]*grade(grade_obtain[i]);
		}

		this.spi=(double)total_point/total_credit;
		System.out.println(spi);

	}


}

public class lab7A1{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your Id no");
		int id_no=sc.nextInt();
		System.out.println("enter total sub");
		int no_of_sub=sc.nextInt();
		String[] sub_code=new String[no_of_sub];
		int[] sub_credit=new int[no_of_sub];
		String[] grade_obtain=new String[no_of_sub];
		for(int i=0;i<no_of_sub;i++){
			System.out.println("Enter sub code");
			sub_code[i]=sc.nextLine();
			System.out.println("Enter sub credit");
			sub_credit[i]=sc.nextInt();
			System.out.println("Enter Grade");
			grade_obtain[i]=sc.nextLine();
		}

		Student s1=new Student(id_no,no_of_sub,sub_code,sub_credit,grade_obtain);

		s1.SPI();
	}
}