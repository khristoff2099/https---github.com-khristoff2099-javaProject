import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class mapSortStream {
    public static void main(String[] argv) {
        Map<String, Integer> m = new HashMap<>();
        m.put("Mexico", 5);
        m.put("Germany", 4);
        m.put("France", 3);
        m.put("China", 2);
        m.put("Pakistan", 1);
        Map<String, Integer> r = new LinkedHashMap<>();
        m.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(x -> r.put(x.getKey(), x.getValue()));
        System.out.println(r);
    }
}




