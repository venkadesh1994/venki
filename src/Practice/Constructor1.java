package Practice;

public class Constructor1 {
	public Constructor1() {
System.out.println("Student details");
}
	public Constructor1(int id) {
System.out.println("student id is"+id);
	
	}
	
	public static void main(String[] args) {
		Constructor1 c = new Constructor1();
		Constructor1 c1 = new Constructor1(4);
	}
	
	
	
}