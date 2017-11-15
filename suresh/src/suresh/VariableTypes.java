package suresh;

public class VariableTypes {
	
	public static int a = 30; 
	public static void main(String[] args) {
		int b = 20;
		System.out.println(a+b);
		call();
		
	}
	public static void call(){
		int c = 30;
		System.out.println(c);
		System.out.println(a+c);
	}

}
