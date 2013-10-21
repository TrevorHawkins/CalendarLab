package csc180.Dates; 
import java.util.*; 
import java.text.*;

public class Calendar1 {  
	static Scanner scan = new Scanner(System.in);
	
	public void AgeCalculator(){  
		int year, month, day;
		System.out.println("Enter your birth year:");
		year = scan.nextInt();  
		System.out.println("Enter your birth month:");
		month = scan.nextInt();  
		System.out.println("Enter your birth day:");
		day = scan.nextInt(); 
		
		
		GregorianCalendar date1 = new GregorianCalendar(year, month, day);
		GregorianCalendar date2 = new GregorianCalendar();

		date2.add(Calendar.YEAR, -date1.get(Calendar.YEAR));
		date2.add(Calendar.MONTH, -date1.get(Calendar.MONTH));
		date2.add(Calendar.DAY_OF_MONTH, -date1.get(Calendar.DAY_OF_MONTH) + 1);

		int years = date2.get(Calendar.YEAR);
		int months = date2.get(Calendar.MONTH);
		int days = date2.get(Calendar.DAY_OF_MONTH) - 1;

		System.out.println("You are : " + years+" years" +", " + months +" months"+", "+ days + " days old"); 

	}    
	
	public void AnniversaryCalculator(){
		
	} 
	
	public void AgeDifferenceCalculator(){  
		int year, month, day; 
		int year1, month1, day1;
		System.out.println("Enter First birth year:");
		year = scan.nextInt();  
		System.out.println("Enter First birth month:");
		month = scan.nextInt();  
		System.out.println("Enter First birth day:");
		day = scan.nextInt(); 
		System.out.println("Enter Second birth year:");
		year1 = scan.nextInt(); 
		System.out.println("Enter Second birth month:"); 
		month1 = scan.nextInt(); 
		System.out.println("Enter Second birth day:"); 
		day1 = scan.nextInt();
		
		GregorianCalendar date1 = new GregorianCalendar(year, month, day);
		GregorianCalendar date2 = new GregorianCalendar(year1, month1, day1);

		date2.add(Calendar.YEAR, -date1.get(Calendar.YEAR));
		date2.add(Calendar.MONTH, -date1.get(Calendar.MONTH));
		date2.add(Calendar.DAY_OF_MONTH, -date1.get(Calendar.DAY_OF_MONTH) + 1);

		int years = date2.get(Calendar.YEAR);
		int months = date2.get(Calendar.MONTH);
		int days = date2.get(Calendar.DAY_OF_MONTH) - 1;

		System.out.println("There are " + years+" years" +", " + months +" months"+", "+ days + " days between " + month+ " " + day+ ", "+ year+" " + "and " + month1+" " + day1 +", "+ year1); 
	
	}

}
