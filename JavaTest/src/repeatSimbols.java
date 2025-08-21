import java.util.Stack;

class repeatSimbols {
    public static void main(String[] args) {
	    String ss = "(){}[]";
	    System.out.println(isValid(ss));
	}
    public static boolean isValid(String ss) {
        Stack<Character> s = new Stack<Character>();
        for (char c : ss.toCharArray()) {
            if (c == '(')
                s.push(')');
            else if (c == '{')
                s.push('}');
            else if (c == '[')
                s.push(']');
            else if (s.isEmpty() || s.pop() != c)
                return false;
        }
        return s.isEmpty();
    }
}
