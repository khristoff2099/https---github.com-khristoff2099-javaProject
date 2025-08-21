import java.util.stream.IntStream;

public class palindromeStream {
    public static void main(String[] args){
    	String s = "sugus";
        System.out.print(isPalindrome(s));
    }
    public static Boolean isPalindrome(String s) {
    	return IntStream.range(0, s.length()/2).noneMatch(i -> s.charAt(i) != s.charAt(s.length() - 1 - i));
    }
}