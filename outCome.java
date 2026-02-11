import java.util.Scanner;

public class outCome {
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("x =");
		int x = sc.nextInt();
		System.out.print("y =");
		int y = sc.nextInt();
		System.out.print("z =");
		int z = sc.nextInt();
		
		int product;
		
		if(x==7) {
			product = y*z;
			System.out.println(product);
		}else if(y==7) {
			product = z;
			System.out.println(product);			
		}else if(z==7) {
			System.out.println(-1);
		}else {
			product = x*y*z;
			System.out.println(product);
		}
	}
	
	

}
