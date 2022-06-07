package Practice;

public class Casting {
	public static void main(String[] args) {
		Short a=5;
		int b=a;
		System.out.println("widening is"+ b);
		int c= 10;
		short d= (short) c;
		System.out.println("Narrowing is"+d);
	}

}
