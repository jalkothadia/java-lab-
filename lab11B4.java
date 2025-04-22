class even implements Runnable{
	public void run(){
		try{
			for(int i=1;i<21;i++){
				if(i%2==0){
					System.out.println("Even Number = "+i);
				}
				Thread.sleep(1000);
			
		}
		}catch(Exception e){
				e.printStackTrace();
			}
	}
}

class odd implements Runnable{
	public void run(){
		try{
			for(int i=1;i<21;i++){
				if(i%2!=0){
					System.out.println("odd number = "+i);
				}
				Thread.sleep(1000);
			}
			}
			catch(Exception e){
				e.printStackTrace();
		}
	}
}

public class lab11B4{
	public static void main(String[]args) throws Exception{
		even e=new even();
		Thread t1=new Thread(e);
		t1.start();
		t1.join();
		odd o=new odd();
		Thread t2=new Thread(o);
		t2.start();
		t2.join();

	}
}