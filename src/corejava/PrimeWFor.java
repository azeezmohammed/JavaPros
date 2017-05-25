package corejava;

import java.util.Scanner;

public class PrimeWFor {
	
	int a,i,j,count;
	Scanner s=new Scanner(System.in);
	
	void userInputs(){
		
		System.out.println("Enter any number");
		a=s.nextInt();
		System.out.println();
		System.out.println("Prime numbers are");
		
		
	}
	
	void isPrime(){
		
		for(i=1;i<=a;i++){
				
			for(j=1;j<=i;j++){
				
				if(i%j==0)
					
				count++;
				
			}
			

			if(count==2)
				
				System.out.println(i);
			
			count=0;
			
		}
			
			
		}
	

	public static void main(String[] args) {
		
		PrimeWFor pi=new PrimeWFor();
		pi.userInputs();
		pi.isPrime();

	}

}
