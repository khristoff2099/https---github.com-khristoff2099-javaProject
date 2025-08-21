import java.util.Map;
import java.util.LinkedHashMap;

public class uniqueCharStream {
    public static void main(String []args){
        String s = "aaeeiioouux";
        int i = firstUniqChar(s);
        System.out.println(i);
    }
    public static int firstUniqChar(String s) {
        Map<Character, Integer> cm = new LinkedHashMap<>();
        s.chars().mapToObj(c -> (char) c).forEach(c -> cm.put(c, cm.getOrDefault(c, 0) + 1));
        return cm.entrySet().stream().filter(e -> e.getValue() == 1).map(e -> s.indexOf(e.getKey())).findFirst().orElse(-1); 
    }
}

   
    

