package calculator.javaprogram;

import java.util.Scanner;

class MyCalculator{
	double a,b;
	
	MyCalculator(double a, double b){
		this.a=a;
		this.b=b;
	}
	double tambah() {
		return a+b;
	}
	double kurang() {
		return a-b;
	}
	
	double kali() {
		return a*b;
	}
	
	double bagi() {
		if (b == 0) {
			System.out.println("devided by zero is not allowed");
			return 0;
		}else {
			return a/b;
		}
	}
}

public class MainCalculator {
	public static void main(String[] args) {
	try (Scanner userInput = new Scanner(System.in)){
		
		System.out.print("Enter a : ");
		double a = userInput.nextDouble();		
		System.out.print("Enter Operator (+, -, *, /) : ");
		String operator = userInput.next();
		System.out.print("Enter b : ");
		double b = userInput.nextDouble();
		
		double hasil = 0;
		
		MyCalculator cls = new MyCalculator(a,b);
		
	
		
		switch (operator) {
		case "+": 
			hasil=cls.tambah();
			break;
		case "-":
			hasil=cls.kurang();
			break;
		case "*": 
			hasil=cls.kali();
			break;
		case "/":
			hasil=cls.bagi();
			break;
		default: System.out.println("Invalid operation");
		}
		 
		System.out.println(a + " "+operator +" " + b +" = " + hasil); 
  		
	}catch (Exception e){
        e.getMessage();
      System.out.println("Wrong data input");
    }
	}
}
