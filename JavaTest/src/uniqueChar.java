public class uniqueChar {
    public static void main(String []args){
        String s = "aaeeiioouux";
        Character i = unique(s);
        System.out.println(i);    
    }
    public static Character unique(String s) {
		char[] a = s.toCharArray();
 		char r = s.charAt(0); 		
 		for(int i=0;i<a.length;i++){
 			for(int j=0;j<a.length;j++){
 				if(a[i] != a[j]) {
 					r = a[i]; 					
 				}
 			}
		}	
 		return r;
    } 
}

    

