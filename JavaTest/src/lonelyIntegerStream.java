import java.util.List;
import java.util.Arrays;

public class lonelyIntegerStream {
    public static void main(String[] args) {
	    List<Integer> l = Arrays.asList(1,2,3,4,3,2,1);
	    Long r =  l.stream().distinct().count();
	    System.out.println(r);
    }
}
