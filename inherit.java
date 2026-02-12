import java.util.Scanner;

public class inherit extends Car{
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Car cr = new Car();
		System.out.print("type =");
		cr.type = sc.next();
		System.out.print("carModel =");
		cr.carModel = sc.nextInt();
		System.out.print("carName =");
		cr.carName = sc.next();
		System.out.print("carmileage =");
		cr.mileage = sc.nextFloat();
		System.out.print("The Car specifications are:"+" "+cr.type);
		System.out.print(", " + cr.carModel);
		System.out.print("model, " + cr.carName);
		System.out.print(", " + cr.mileage + "km/L");
		sc.close();
		}
	
}


class Car{
	    String type;
		int carModel;
		int year;
		String carName;
		float mileage;			
}
