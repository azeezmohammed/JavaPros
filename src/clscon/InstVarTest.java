package clscon;

public class InstVarTest {
	
	int x;
	
	void mod1(){
		
		x=10;
		System.out.println("x value is "+x);
	}
	
	void mod2(){
		
		x=20;
		System.out.println("x value is "+x);
	}

	public static void main(String[] args) {
		
		InstVarTest i=new InstVarTest();
		i.mod1();
		i.mod2();

	}

}
