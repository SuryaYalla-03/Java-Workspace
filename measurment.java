import java.util.*;
class measurment {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Rectangle rectangle=new Rectangle();
		System.out.print("Enter the length value: ");
		rectangle.length = sc.nextFloat();
		System.out.print("Enter the width value: ");
		rectangle.width = sc.nextFloat();
		System.out.print("Area of the rectangle is " + rectangle.calculateArea());
		System.out.print("Perimeter of the rectangle is " + rectangle.calculatePerimeter());
	}

}

class Rectangle {
    float length;
    float width;
    double calculateArea(){
        double area = length * width;
        area = Math.round(area*100.0)/100.0;
        return area;
    }
    double calculatePerimeter(){
        double perimeter = 2*(length+width);
        perimeter = Math.round(perimeter*100.0)/100.0;
        return perimeter;
        
    }
}

