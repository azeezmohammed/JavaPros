package clscon;

import java.util.Scanner;

public class Animal {
	
	String name;
	int lifeSpan;
	String shelter;
	Scanner s=new Scanner(System.in);
	
	void userInputs(){
		
		System.out.println("Enter animal name");
		name=s.next();
		System.out.println("Enter "+name+" lifespan");
		lifeSpan=s.nextInt();
		System.out.println("Enter "+name+" shelter");
		shelter=s.next();
		System.out.println();
	}
	
	void speak(){
		
		System.out.println(name+" Roars");
	}
	
	void move(){
		
		System.out.println(name+" moves slowly");
		System.out.println(name+" lives "+lifeSpan+" years in its "+shelter+" in forest");
	}

	public static void main(String[] args) {
		
		
		Animal l=new Animal();
		l.userInputs();
		l.speak();
		l.move();
	}

}
