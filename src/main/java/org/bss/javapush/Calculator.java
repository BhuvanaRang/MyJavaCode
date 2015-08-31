package org.bss.javapush;
import java.util.Scanner;


public class Calculator {
	int a,b;
	//char c;
	public int addition(int a,int b){
		return(a+b);
	}
	public int subtraction(int a,int b){
		return(a-b);
	}
	public int multiplication(int a,int b){
		return(a*b);
	}
	public int division(int a,int b){
		return(a/b);
	}


public static void main(String[] args){
	Calculator calc=new Calculator();
	System.out.println("Enter the first number, second number, operation (+, - , *, /)");
	Scanner scan=new Scanner(System.in);
	int num1=scan.nextInt();
	//Scanner scan2=new Scanner(System.in);
	//System.out.println("Enter the second number");
	int num2=scan.nextInt();
	//Scanner scan3=new Scanner(System.in);
	String op=scan.nextLine().trim();
	scan.close();
	
	int result = 0;
	if(op.equals("+")){
		result = calc.addition(num1,num2);
	}else if(op.equals("-")){
		result = calc.subtraction(num1, num2);
	}else if(op.equals("*")){
		result = calc.multiplication(num1, num2);
	}
	else {result = calc.division(num1, num2);
	}

    System.out.println("The result of the operation is  " + result);
}
}
	
	
	
	
	
	
	


