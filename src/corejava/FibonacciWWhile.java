package corejava;

import java.util.Scanner;

public class FibonacciWWhile {
	
	int a,f;
	Scanner s=new Scanner(System.in);
	
	void userInputs(){
		
		System.out.println("Enter any number");
		a=s.nextInt();
	}
	
	int fibonacci(int n){
		
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else
			return(fibonacci(n-1)+fibonacci(n-2));
	}
	
	void operationPerformed(){
		
		System.out.println("fibonacci series:");
		int i=1;
		while(i<=a){
			System.out.println(fibonacci(f));
			f++;
			i++;
		}
	}

	public static void main(String[] args) {
		
		FibonacciWFor fi=new FibonacciWFor();
		fi.userInputs();
		fi.operationPerformed();

	}

}
