interface EventListener{
	public void performEvent();
}
interface MouseListener extends EventListener{
	public void mouseClicked();
	public void mousePressed();
	public void mousereleased();
	public void mouseMoved();
	public void mouseDragged();
} 

interface keyListener extends EventListener{
	public void keyPressed(){
		System.out.println("Key Pressed");
	}
	public void keyReleased(){
		System.out.println("Key Relesed");
	}
}

class EventDemo implements MouseListener,keyListener{

}

public class lab9A4{
	public static void main(String[]args){
		EventDemo e=new EventDemo();

		e.mouseClicked();
	}
}