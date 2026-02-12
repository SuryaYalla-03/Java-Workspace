import java.util.Scanner;

public class palindrome{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("n =");
            int n = sc.nextInt();
            int given = n;
            int reverse = 0;
            while(n!=0){
                int digit = n%10;
                reverse = reverse*10+digit;
                n = n/10;
            }
            if(given==reverse){
                System.out.println("is Palindrome number");
            }else{
                System.out.println("is not palindrome number");
            }
        
    }
}
