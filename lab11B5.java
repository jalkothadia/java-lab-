
class main_thread implements Runnable{
		public void run(){
		
		
		while(true){
			double temp = Math.random();
		System.out.println(temp);
		System.out.println(temp*100);
		int n = (int)(temp*100);
			if(n%2==0){
			even_thread e = new even_thread(n);
			Thread even_t = new Thread(e);
			even_t.start();
		}
		else{
			odd_thread o = new odd_thread(n);
			Thread odd_t = new Thread(o);
			odd_t.start();
		}
		}
	}
}

class even_thread implements Runnable{
	private int n;
	public even_thread(int n){
		this.n=n;
	}
	public void run(){
		System.out.println("square = "+(n*n));
	}

}

class odd_thread implements Runnable{
	private int n;
	public odd_thread(int n){
		this.n = n;
	}
	public void run(){
		System.out.println("cube = "+(n*n*n));
	}
}


public class lab11B5{
	public static void main(String[]args){
		main_thread t=new main_thread();
		Thread main_t = new Thread(t);
		main_t.start();
		

		
	}
}