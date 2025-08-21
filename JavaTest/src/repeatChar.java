public class repeatChar {
    public static void main(String[] args) {
    	String s = "christopher";
    	for (int i=0;i<s.length();i++) {
            for (int j=i+1;j<s.length();j++) {
                if (s.charAt(i) == s.charAt(j)) {	
                	System.out.println(s.charAt(i));
                }
            }
        }
    }
}

