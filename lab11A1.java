class GM implements Runnable{
	public void run(){
	while(true){
		
		System.out.println("Good Morning");
		try{
			Thread.sleep(1000);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
}

class GA implements Runnable{
	public void run(){
	while(true){
		System.out.println("Good Afternoon");
		try{
			Thread.sleep(3000);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
	
}



public class lab11A1{
	public static void main(String[]args){
		GM t=new GM();
		Thread t1=new Thread(t);
		t1.start();
		GA t2=new GA();
		Thread t3=new Thread(t2);
		t3.start();

	}
}
 