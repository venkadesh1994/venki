package Practices;

public class Overloading {
public void std( int id) {
	System.out.println("enter your id "+id);
}
public void std(String name) {
System.out.println("enter your name "+name);
}

public static void main(String[] args) {
	Overloading o = new Overloading();
	o.std(6);
	o.std("venki");
}







}
