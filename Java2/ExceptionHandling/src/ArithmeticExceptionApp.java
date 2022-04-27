//keywords:
//try: block for source of exception
//try{
//	code here
//}
//catch(): block to provide solution for an exception
//catch(ArithmeticException arthEx){
//	code here
//}
//finally: block that executes whether an exception occurred or not
//throw- to forcibly throw an exception- usually based on condition
//throws- to bypass exception by JVM (Java Virtual Machine) / Java Interpreter

import java.util.Scanner;
public class ArithmeticExceptionApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dividend, divisor, quotient;
		System.out.println("Enter dividend:");
		dividend=sc.nextInt();
		System.out.println("Enter divisor:");
		divisor=sc.nextInt();
		try {
			quotient=dividend/divisor;
			System.out.println(quotient);
		}catch(ArithmeticException arthExp) {
			System.out.println(arthExp); //err- will show in red
			System.err.println(arthExp.getMessage());
		}
		finally {
			System.out.println("In finally block"); //will execute in either case
		}
	}

}
