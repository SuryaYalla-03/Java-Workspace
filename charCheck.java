import java.util.*;
class charCheck{
    
    public static String moveSpecialCharacters(String str){
		String letter ="";
		String specials="";
		for(int i=0; i<str.length(); i++){
		    char ch = str.charAt(i);
		    if(Character.isLetter(ch)){
		        letter+=ch;
		    }else{
		        specials+=ch;
		    }
		}
    return letter+specials;
	}
	
	public static void main(String args[]){
	    String str = "He@#$llo!*&";
	    System.out.println(moveSpecialCharacters(str));
	}
	
}
