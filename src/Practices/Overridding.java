package Practices;

public class Overridding extends Ridding {
	
	public void colour() {
System.out.println("colour is white");
	}
	@Override
	public void ice() {
		super.ice();
	}
	public static void main(String[] args) {
		Overridding o = new Overridding();
		o.ice();
		o.colour();
	}

}
