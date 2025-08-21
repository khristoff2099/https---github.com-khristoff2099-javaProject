import java.util.HashMap;

public class splitRepeat {
	public static void main(String[] args) {
		String s = "Hola mundo como estas mundo";
		String[] str = s.split(" ");		
		HashMap<String, Integer > a = new HashMap<String, Integer>();		
		for(int i=0;i<str.length;i++) {
				int c = 0;
				for(int j=0;j<str.length;j++) {
					if(str[i].equals(str[j])) {
						c++;
					}   
				}			
			a.put(str[i], c);			
		}
		System.out.println(a);
	}
}