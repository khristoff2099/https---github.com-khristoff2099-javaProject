import java.util.HashMap;

public class counter{

	public static void main(String[] args) {
		String str = "1234676.540003.2430009-218887?.98234+22346,780:89797^68586";
		String replace = str.replaceAll("[-+.^:,?]","");
	 	HashMap<Character, Integer> result = match(replace);
	    System.out.println(result);
	}

	public static HashMap<Character, Integer> match(String str) {
		HashMap<Character, Integer> res = new HashMap<Character, Integer>();
	    for (int i=0;i<str.length();i++){
	    	int count = 0;
	    	 for (int j=0;j<str.length();j++) {
	            if(str.charAt(i) == str.charAt(j)){
	            	count++;
	            }
	    	 }	
	    	  res.put(str.charAt(i), count);
	    }
	    return res;
	}
}