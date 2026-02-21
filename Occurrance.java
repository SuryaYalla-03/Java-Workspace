class Occurrance {

	public static int findHighestOccurrence(String str){
		int maxCount = 0;
		for(int i=0; i<str.length(); i++){
		    int count = 0;
		    for(int j=0; j<str.length(); j++){
		        if(str.charAt(i)==str.charAt(j)){
		            count++;
		        }
		        }
		        if(count>maxCount){
		            maxCount = count;
		    }
		}
        return maxCount;
	}
	
	public static void main(String args[]){
	    String str = "success";
	    System.out.println(findHighestOccurrence(str));
	}
}
