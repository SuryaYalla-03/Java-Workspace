import java.util.*;
class Word{

    public static String reverseEachWord(String str) {
        
        String[] words = str.split(" ");
        String result = "";
        
        for(int i = 0; i < words.length; i++){
            
            String reversed = "";
            
            for(int j = words[i].length() - 1; j >= 0; j--){
                reversed += words[i].charAt(j);
            }
            
            result += reversed;
            
            if(i != words.length - 1){
                result += " ";
            }
        }
        
        return result;
    }

    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the Scentence: ");
        String str = sc.nextLine();
        System.out.println(reverseEachWord(str));
    }
}
