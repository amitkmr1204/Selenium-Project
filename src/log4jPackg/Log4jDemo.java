package log4jPackg;

import org.testng.log4testng.Logger;

public class Log4jDemo {

	static Logger log = Logger.getLogger(Log4jDemo.class);
	

	 public static void main(String[] args) {
		
		System.out.println("Hello World");
		
		log.info("This is an info message");
		log.warn("This is warn message");
		log.fatal("This is fatal message");
		log.error("This is an error message");
		
		System.out.println("Completed");
		
	

			// ****************************** Adding 2 numbers*******************

			System.out.println("I started Java learning");

			//Add 2 numbers 2, 3 5

			int a=2;

			int b=3;

			int Sum=a+b;

			System.out.println("Sum is"+Sum);

			//Sum is 5

			//************************* Strings*********************************

			// Payment $100 paid

			//

			String str ="Payment $100 paid";

			System.out.println(str.charAt(8));

			//sigle

			String str1="Payments $100 paid";

			System.out.println(str.indexOf("$"));

			System.out.println(str.substring(8));

			//*************************************************************

			
			
	

	}

}
