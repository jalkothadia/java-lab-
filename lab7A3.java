import java.util.Scanner;

class Member{
	String name;
	int age;
	String number;
	String address;
	double salary;

	Member(String name,int age,String number,String address,double salary){
		this.name=name;
		this.age=age;
		this.number=number;
		this.address=address;
		this.salary=salary;
	}

	void printsalary(){
		System.out.println(this.salary);
	}
}

class Employee extends Member{
	String specialization;
	Employee(String name,int age,String number,String address,double salary){
		this.name=name;
		this.age=age;
		this.number=number;
		this.address=address;
		this.salary=salary;
	}
}

class Manager extends Member{
	String department;
	Manager(String name,int age,String number,String address,double salary){
		this.name=name;
		this.age=age;
		this.number=number;
		this.address=address;
		this.salary=salary;
	}
} 


public class lab7A3{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		Member m;
		System.out.println("enter post");
		String pos=sc.next();
		if(pos.equals("Employee")){
			Employee em=new Employee("kaivalya",19,"92276","neel city club",10000);

			printsalary();
			
		}
		else if(pos.equals("Manager")){
			Manager em=new Manager("manan",19,"56652","bhavnagar",10000);

			printsalary();
		}
	}
}