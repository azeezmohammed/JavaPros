package corejava;

import java.util.Scanner;

public class PrimeWWhile {
	
	int a,i,j,count;
	Scanner s=new Scanner(System.in);
	
	void userInputs(){
		
		System.out.println("Enter any number");
		a=s.nextInt();
		System.out.println();
		System.out.println("Prime numbers are");
		
		
	}
	
	void isPrime(){
		i=1;
		while(i<=a){
				
			j=1;
			while(j<=i){
				
				if(i%j==0)
					
				count++;
				j++;
				
			}
			

			if(count==2)
				
				System.out.println(i);
			
			count=0;
			i++;
			
		}
			
			
		}
	

	public static void main(String[] args) {
		
		PrimeWFor pi=new PrimeWFor();
		pi.userInputs();
		pi.isPrime();

	}

}
