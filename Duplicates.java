class Duplicates{
    public static String removeDuplicatesandSpaces(String str){
        String result = "";
        
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            
            if(ch == ' '){
                continue;
            }
            
            if(result.indexOf(ch) == -1){
				result += ch;
			}
        }
        return result;
	}
	
	public static void main(String args[]){
	    String str = "object oriented programming";
	    System.out.println(removeDuplicatesandSpaces(str));
	}
}
