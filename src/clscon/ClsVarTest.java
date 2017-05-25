package clscon;

public class ClsVarTest {
	
	static int x;
	
	void display(){
		
		x=10;
		System.out.println("x value is "+x);
	}

	public static void main(String[] args) {
		
		ClsVarTest c=new ClsVarTest();
		c.display();
	}

}
