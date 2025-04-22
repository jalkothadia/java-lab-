import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.LinkedList;

class students{
	String name;
	int rollno;

	public students(String name,int rollno){
		 this.name=name;
		this.rollno=rollno;
	}
}

public class listdemo{
	public static void main(String[]args){
		List<students> students=new LinkedList<students>();
		students.add(new students("Jal",101));
		students.add(new students("Archan",102));
		students.add(new students("Meet",103));
		students.add(new students("Yashvi",104));
		students.add(new students("Shree",105));

		Iterator<students> i=students.iterator();

		while(i.hasNext()){
			System.out.println(i.next());
		}


			List<String> students=new ArrayList<>();
		students.add("jal");
		students.add("Archan");
		students.add("Meet");
		students.add("Yasshvi");
		students.add("Shree");

		Iterator i=students.iterator();

		while(i.hasNext()){
			System.out.println(i.next());
		}
	}
} 