package Practice;

public class Variable {
	int b=20;
	static int c=30;
	public void id() {
		int a=10;
		System.out.println("the value a is"+a);
		
		System.out.println("the value b is"+b);
	}
	public static void main(String[] args) {
		Variable v = new Variable();
		v.id();
		System.out.println(v.b);
		System.out.println(c);
				
	}
	
	
	}


