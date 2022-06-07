package Practice;

public class Array {
	public static void main(String[] args) {
		int a[]=new int[5];
		String b[]=new String[2];
		 a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		a[2]=16;
		b[0]="venki";
		b[1]="sathya";
		b[1]=null;
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}
		for (String word : b) {
			System.out.println(word);
		}
		
		
		
		
		
		
		
		
		
	}

}
