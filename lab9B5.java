interface shape{
	public void getArea();
}

class Rectangle implements shape{

	public void getArea(){
		System.out.println("Area of rectangle");
	}
}

class Circle implements shape{

	public void getArea(){
		System.out.println("Area of Circle");
	}
}

class Triangle implements shape{

	public void getArea(){
		System.out.println("Area of triangle is");
	}
}

public class lab9B5{
	public static void main(String[]args){
		Rectangle r=new Rectangle();
		Circle c=new Circle();
		Triangle t=new Triangle();

		r.getArea();
		c.getArea();
		t.getArea();
	}
}