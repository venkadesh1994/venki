package Practice;

public class Mutable {
public static void main(String[] args) {
	StringBuffer sb = new StringBuffer ("Good");
	StringBuffer sb1=new StringBuffer("Morning");
	StringBuffer sb2=new StringBuffer("Good");
	
	System.out.println(System.identityHashCode(sb));
	System.out.println(System.identityHashCode(sb1));
	System.out.println(System.identityHashCode(sb2));
	StringBuffer append = sb.append(sb2);
	System.out.println(System.identityHashCode(append));
	
}

}
