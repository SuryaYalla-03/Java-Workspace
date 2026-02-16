import java.util.*;
public class Methods{

	public static void main(String args[]) {
		Calculator cal = new Calculator();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1: ");
		int number1 =sc.nextInt();
		System.out.println("Enter num2: ");
		int number2 = sc.nextInt();
		System.out.println("Enter num3: ");
		int number3 = sc.nextInt();
		double Average = cal.findAverage(number1,number2,number3);
		System.out.print(Average);
		
	}
}

class Calculator {
	public double findAverage(int number1, int number2, int number3){
	    double avg = (number1+number2+number3)/3.0;
	    avg = Math.round(avg*100.0)/100.0;
	    return avg;
	}
}
