package Practice;

public class Immutable {
public static void main(String[] args) {
	String s="good";
	String s1="morning";
	String s2="good";
	
	System.out.println(System.identityHashCode(s));
	System.out.println(System.identityHashCode(s1));
	System.out.println(System.identityHashCode(s2));
	String concat = s.concat(s2);
	System.out.println(System.identityHashCode(concat));
}

}

