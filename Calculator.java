import java.util.Scanner;

public class Calculator {
	
	public static void main (String args[])
	{
	
		CalculatorFunctions cf=new CalculatorFunctions();
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter input1");
		Integer A=scan.nextInt();
		
		System.out.println("Please enter input2");
		Integer B=scan.nextInt();
		
		System.out.println("Please enter your operation");
		String C=scan.next();
		
		switch( C)
		{
		case "+":
			System.out.println(	cf.add(A, B));
			break;
		case "-":
			System.out.println(cf.sub(A, B));
			break;
		case "*":
			System.out.println(cf.mul(A, B));
			break;
		case "/":
			System.out.println(cf.div(A, B));
			break;
			default:System.out.println("Invalid input");
		}
	}

}
