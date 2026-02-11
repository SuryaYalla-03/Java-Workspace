import java.util.Scanner;

public class billGeneration {
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("food type (V/N): ");
        char foodType = sc.next().charAt(0);

        System.out.print("quantity: ");
        int quantity = sc.nextInt();

        System.out.print("distance: ");
        int distance = sc.nextInt();

        int Cost = 0;
        int delivery= 0;
        int totalBill;

        if ((foodType != 'V' && foodType != 'N') || quantity < 1 || distance <= 0) {
            System.out.println(-1);
        } 
        else {

            if (foodType == 'V') {
                Cost = quantity * 12;
            } else {
                Cost = quantity * 15;
            }

            
            if (distance <= 3) {
                delivery = 0;
            } 
            else if (distance <= 6) {
                delivery = (distance - 3) * 1;
            } 
            else {
                delivery = (3 * 1) + (distance - 6) * 2;
            }

            totalBill = Cost + delivery;
            System.out.println("Total Bill = " + totalBill);
        }

        sc.close();
	}
	

}
