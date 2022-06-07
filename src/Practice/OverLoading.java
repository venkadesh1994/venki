package Practice;

public class OverLoading {
	public void std(String Name) {
		System.out.println("Student name is "+ Name);

	}
public void std(int id) {
	System.out.println("Student id is "+id);

}
public void std(long num) {
System.out.println("student num is "+ num);
}
public static void main(String[] args) {
	
	OverLoading o = new OverLoading();
	o.std(3);
	o.std("venki");
	o.std(814899505);
}



}
