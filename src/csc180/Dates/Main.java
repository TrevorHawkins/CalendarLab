package csc180.Dates;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {   
		boolean isRunning = true; 
		while(isRunning){
		Scanner scan = new Scanner(System.in); 
		Calendar1 cal = new Calendar1();    
		System.out.println("Option: 1] age calculator, 2] anniversary calculator, 3] age difference calculator, 0] exit");
		int decision = scan.nextInt();
		
		
			switch(decision){ 
			case 1:  
				cal.AgeCalculator();
				break; 
			case 2: 
				cal.AnniversaryCalculator();
				break; 
			case 3: 
				cal.AgeDifferenceCalculator(); 
				break; 
			case 0: 
				isRunning = false;
			} 
		}
	}

}
