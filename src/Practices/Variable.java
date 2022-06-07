package Practices;

public class Variable {
	int b=20;
	static int c=30;
	public void std() {
int a =10;
System.out.println("value for a is"+a);
System.out.println("value for a is "+b);
	}
	public static void main(String[] args) {
		Variable v = new Variable();
		v.std();
		System.out.println(v.b);
		System.out.println(c);
	}
}


