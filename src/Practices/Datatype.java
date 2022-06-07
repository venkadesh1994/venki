package Practices;

public class Datatype {
public void stdName(String name) {
	System.out.println("enter your name"+name);
}

public void stdId(int Id) {
System.out.println("enter your id"+ Id);
}
public static void main(String[] args) {
	Datatype d= new Datatype();
	d.stdName("venki");
	d.stdId(56);
}


}
