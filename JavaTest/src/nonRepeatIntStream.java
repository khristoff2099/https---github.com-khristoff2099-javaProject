import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Collections;

public class nonRepeatIntStream {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(55,55,23,23,60,60,0);
        List<Integer> r = l.stream().filter(i -> Collections.frequency(l, i) == 1).collect(Collectors.toList());
        System.out.print(r);  
	}
}
