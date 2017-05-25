package clscon;

import java.util.Scanner;

public class LocVarTest1 {
	
	Scanner s=new Scanner(System.in);
	
	static void display(){
		
		int x=10;
		System.out.println("Local Variable x is "+x);
	}

	public static void main(String[] args) {
		
		display();
		

	}

}