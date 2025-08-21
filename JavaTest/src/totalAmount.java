import java.math.BigDecimal;

public class totalAmount {
	public static void main(String[] args) {
	    coins(1.0);
	    coins(0.9);
	    coins(2.16);
	}
	public static void coins(double t){
		BigDecimal a = BigDecimal.valueOf(t),
				s = new BigDecimal("0"), 
				c = new BigDecimal("0.01"), 
				q = new BigDecimal("0.25"), 
				n = new BigDecimal("0.05"), 
				d = new BigDecimal("0.10");
	    int cs = 0, qs = 0, ns = 0, ds = 0;
	    while (s.compareTo(a) < 0) {
	        if (s.add(q).compareTo(a) <= 0){
	            s = s.add(q);
	            qs++;
	        } else if (s.add(d).compareTo(a) <= 0) {
	            s = s.add(d);
	            ds++;
	        } else if (s.add(n).compareTo(a) <= 0) {
	            s = s.add(n);
	            ns++;
	        } else if (s.add(c).compareTo(a) <= 0){
	            s = s.add(c);
	            cs++;
	        }
	    }
	    System.out.println(qs + " quarters " + ds + " dimes " + ns + " nickles " + cs + " cents");
	}
}