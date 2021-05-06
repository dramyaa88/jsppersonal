package com.businesslogic;

import java.util.Scanner;

import com.access.User_Validation;
import com.pojo.loanDetails;

public class BusinessLogic1 extends loanDetails{
	static int eligibility;
	Scanner sc = new Scanner(System.in);
	User_Validation uv = new User_Validation();
	
	public void welcomePage() {
        System.out.println("Welcome to avail Personal Loan");
        System.out.println("-------------------------------");
        System.out.println("You can avail personal loan for ");
        System.out.println("1. Medical Emergency ");
        System.out.println("2. Debt Consolidation ");
        System.out.println("3. Higher Education");
        System.out.println("4. Home Renovation ");
        System.out.println("5. Used Cars ");
        System.out.println("6. Wedding ");
        System.out.println("7. Travel");
        System.out.println();
        System.out.println("The maximum loan amount is 200000 and the minimum loan amount is 100000");
    }
	
	public void eligibility(String city,int sal, int expense) {
    	
		double rand = (int)Math.floor(Math.random()*(9999-1111+1)+1111);
        uv.setOtp(rand);
        System.out.println(uv.getOtp());
        System.out.println("Enter the Otp: ");
        double check = sc.nextInt();
        if (check==rand) {
        int inHandSalary;
        System.out.println();

      //  if (age >= 23 && age <= 55) {
            inHandSalary = sal - expense;
            if (inHandSalary > 15000) {
                if (inHandSalary >= 15000 && inHandSalary <= 30000) {
                    System.out.println("You are eligible to take loan upto 500000");
                } else if (inHandSalary > 30000 && inHandSalary <= 60000) {
                    System.out.println("you are eligible to take loan upto 100000");
                } else {
                    System.out.println("you are eligible to take loan upto 200000");
                }
                eligibility = 1;
                System.out.println("Documents Required");
                System.out.println("1. Salary Pay \n 2. Aadhaar card \n 3. Pan card \n 4. Photographs ");
                System.out.println("Please press 1 if you have above documents else 2");
                int doc = sc.nextInt();
                if (doc == 1) {
                    System.out.println("Proceed Further");
            
                    BusinessLogic2 obj = new BusinessLogic2();
                    obj.loanDetails(getLoanAmount(), getTenure());
                    
                } else {
                    System.out.println("document  needed");
                }
            } else {
                System.out.println("Your In Hand Salary should be greater that 15000 for applying personal loan");
            }
//        } else {
//            System.out.println("Your age should lie between 23 and 55");
//        }
    } 
        else
        {
        	System.out.println("Wrong OTP plz try again");
        }
}

}
