import java.util.ArrayList;
import java.util.List;

public class recursiveObjectStream {
	public static void main(String[] args) {
		Object[] a = {"blue", "yellow", "red", new Object[]{"helicopter", "blimp", new Object[]{"biplane", "seaplane"}}};
		indexing(new ArrayList<>(), a, "");
	}
	private static void indexing(List<Object> r, Object[] a, String i) {
		int c = 0;
		for (Object v : a) {
			if (r.stream().anyMatch(re -> re == v)) {
			return;
		}
		String n;
		if (i.equals("")) {
			n = i + c;
		} else {
			n = i + "." + c;
		}
		if (v instanceof Object[]) {
			r.add(v);
			indexing(r, (Object[]) v, n);
		}
		if (v instanceof String) {
			System.out.println(n + " " + v);
		}
		c++;
		}
	}
}
