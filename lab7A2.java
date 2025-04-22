import java.util.Scanner;

class book{
	private String an;

	book(String an){
		this.an=an;
	}

	void display(){
		System.out.println(this.an);
	}
}

class book_publication extends book{
	private String title;

	book_publication(String an,String title){
		super(an);
		this.title=title;
	}

	void display(){
		super.display();
		System.out.println(this.title);
	}
}

class paper_publication extends book{
	private String title;

	paper_publication(String an,String title){
		super(an);
		this.title=title;
	}

		void display(){
		super.display();
		System.out.println(this.title);
	}
} 

public class lab7A2{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		book b1;
		System.out.println("enter Publication");
		String pub=sc.next();
		if(pub.equals("book_publication")){
			b1=new book_publication("Jal Kothadia","Ravi");
			b1.display();
		}
		else if(pub.equals("paper_publication")){
			b1=new paper_publication("Jal Kothadia","classmate");
			b1.display();
		}


	}
}