package Practice;

public class Example extends Variable {
int b=20;
public void std() {
	 int c=30;
	 
	System.out.println("local variable is"+c);
	System.out.println("current variable"+this.b);
	System.out.println("parent variable"+super.b);

	
}
public static void main(String[] args) {
	Example e=new Example();
	e.std();
}
}
