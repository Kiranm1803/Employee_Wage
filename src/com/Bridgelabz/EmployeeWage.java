package com.Bridgelabz;

public class EmployeeWage {
	
	//constants
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 2;
	public static final int MAX_HRS_IN_MONTH = 10;

	public static void main(String[] args) {
	
	 //variables
	
	 int totalEmpHrs = 0;
	 int totalEmpWage=0;
	 int totalWorkingDay=0;
	 //computation
	
	while(totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDay < NUM_OF_WORKING_DAYS)
	{
		 totalWorkingDay++;
		 
	  int empHrs = 0;
	  int empCheck = (int)Math.floor(Math.random() * 10) % 3;
	 
	  switch(empCheck) {
	 
	  case IS_FULL_TIME:
	           empHrs = 8;
	           break;
	  case IS_PART_TIME:
	           empHrs = 4;
	           break;
	  default :
	           empHrs = 0;
      }
	 
	 totalEmpHrs += empHrs;
	 int empWage = empHrs * EMP_RATE_PER_HOUR;
	 totalEmpWage += empWage;
	 System.out.println("Employee Wage: "+empWage);
	}
	 System.out.println("Total Employee Wage: "+totalEmpWage);
	 
   }
} 