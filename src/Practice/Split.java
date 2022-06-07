package Practice;

public class Split {
public static void main(String[] args) {
	String s= "today tmt rate is no difference";
	String[] split = s.split(" ");
	for (int i = 0; i < split.length; i++) {
		System.out.println(split[i]);
	}
	
	String[] split2 = s.split("",8);
	for (String y: split2) {
		System.out.println(y);
		
	}
	
	
	
	
	
	
}
}
