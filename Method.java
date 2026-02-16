import java.util.Scanner;
public class Method {

	public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
		Calculator calculator = new Calculator();
    System.out.print("Enter the number: ");
		calculator.num = sc.nextInt();
		int result = sumOfDigits();
		System.out.println(result);
	}
}

class Calculator {

int num;
public int sumOfDigits(){
    int number = num;
    int sum = 0;
    
    while(number>0){
        sum = sum +(number%10);
        number = number/10;
    }
    return sum;
}

}
