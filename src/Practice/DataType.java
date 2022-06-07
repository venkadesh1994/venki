package Practice;

public class DataType {
	public void stdName(String name) {
System.out.println("Student name is"+ name);
	}
public void stdId(int Id) {
System.out.println("student id is"+Id);

}
public void empDetails(String initial,String N, long i) {
System.out.println("student details are "+initial+"."+"n"+"."+i+".");
}
public static void main(String[] args) {
	DataType d = new DataType();
	d.stdId(1);
	d.stdName("venki");
d.empDetails("j", "venki", 5);
}
}
