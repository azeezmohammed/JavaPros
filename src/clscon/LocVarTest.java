package clscon;

import java.util.Scanner;

public class LocVarTest {
	
	Scanner s=new Scanner(System.in);
	
	void display(){
		
		int x=10;
		System.out.println("Local Variable x is "+x);
	}

	public static void main(String[] args) {
		
		LocVarTest lvt=new LocVarTest();
		lvt.display();
		

	}

}
