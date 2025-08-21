public class palindrome {
    public static void main(String[] args){
    	 String s = "sugus"; 
    	 String r = "";  
         for (int i=s.length()-1;i>=0;i--){
        	  r = r + s.charAt(i); 
         }   
         if (s.equals(r)){
        	 System.out.println("y"); 
         }else{  
            System.out.println("n");
         }
    }  
}