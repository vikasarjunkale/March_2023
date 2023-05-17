package Demo_1;


//Parent Class
abstract class parentclass{
	
	//Abstract method------------compulsory to override
	public void show1() {
		
	}
	
	//Non-Abstract method OR concrete method------------Not compulsory to override
	public void show2() {
		System.out.println("Non-Abstract method OR concrete method");
	}
}

class childclass extends parentclass {
	
	public void show1() {
		System.out.println("Abstract Method- Compulsory to override");
		
	}
	
	public void show2() {
		System.out.println("Non-Abstract method OR concrete method--Not compulsary to override");
		super.show2();
	}
	
}
	

	public class Abstract_Class {
public static void main(String[] args) {
	
	childclass obj1 = new childclass();
		
	obj1.show2();
	obj1.show1();
	
	parentclass p1=new childclass();
	p1.show2();
	
	
}
}








