import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class containsCharStream {
	public static void main(String[] args) {
        Stream<String> sS = Stream.of("Antonio","Maria","Juan","Pedro").filter(s-> s.contains("a"));
        List<String> l = sS.sorted().collect(Collectors.toList());
        System.out.println(l);
    } 
}
