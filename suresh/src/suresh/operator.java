package suresh;

public class operator {

	public static void main(String[] args) {
		int a = 50;
		int b = 35;
		int c = 38;
		double avg = (a+b+c)/3;
		String str1 = "Hello";
		String str2 = "Class";
		System.out.println(avg);
				
		if (a>=30 && b>=30 && c>=30)
		{
			System.out.println("pass");
			if (avg >= 70)
				System.out.println("1st div");
			else if (avg >= 50 && avg <= 70)
				System.out.println("2nd div");
			else System.out.println ("3rd div");
			
		}
		else System.out.println("fail");
		

	}

}
