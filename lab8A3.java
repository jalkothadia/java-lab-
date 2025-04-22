interface Transport{
	public void Deliver();
}

abstract class Animal{
	abstract public void display();
}

class Tiger extends Animal{
	public void display(){
		System.out.println("Tiger");
	}
}

class Camel extends Animal implements Transport{
	public void display(){
		System.out.println("Camel");
	}
	public void Deliver(){
		System.out.println("Camle Deliver");
	}
}

class Deer extends Animal{
	public void display(){
		System.out.println("Deer");
	}
}

class Donkey extends Animal implements Transport{
	public void display(){
		System.out.println("Donkey");
	}
	public void Deliver(){
		System.out.println("Donkey Deliver");
	}
}

public class lab8A3{
	public static void main(String[] args){
		Animal [] a=new Animal[4];

		a[0] = new Tiger();
		a[1] = new Camel();
		a[2] = new Deer();
		a[3] = new Donkey();

		a[0].display();
		a[1].display();
		((Transport)a[1]).Deliver();
		a[2].display();
		a[3].display();

		
		((Transport)a[3]).Deliver();
	}
}