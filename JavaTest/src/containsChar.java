
public class containsChar {
    public static void main(String[] args) {
    	  String s1="christopher";
          String s2="h";
          int r = match(s1, s2);
          System.out.println("number of match r: " + r);
    }
            
  	public static int match(String s1, String s2) {
  		 int count = 0;
         for (int i=0;i<s1.length();i++){
	       	  for (int j=0;j<s2.length();j++){
	           	  if(s1.charAt(i) == s2.charAt(j)) {
	           		  count++;
	           	  }
	          }
         }   
         return count;
    }
}