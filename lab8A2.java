import java.util.Scanner;

interface A{
	 int a=10;
	 void printa();
}

interface A1 extends A{
	  int a1=12;
	  public void printa1();

}

interface A2 extends A{
	  int a2=14;
	
}

interface A12 extends A1,A2{
	int a12=16;
	public void printa12();
}

class B implements A12{
	 int b=18;
	 

	 public void printa(){
	 	System.out.println(a);
	 }

	 public void printa1(){
	 	System.out.println(a1);
	 }

	 public void printa2(){
	 	System.out.println(a2);
	 }

	 public void printa12(){
	 	System.out.println(a12);
	 }

	 public void printb(){
	 	System.out.println(b);
	 }
}

public class lab8A2{
	public static void main(String[]args){
		B b=new B();
		b.printa();
		b.printa1();
		b.printa2();
		b.printa12();
		b.printb();
	}
}