package suresh;

public class sum {

	public static void main(String[] args) {
		System.out.println("before calling a method");
		sumall();
		System.out.println(sumAll(300));
		sumAll(120);
		
	}

public static void sumall()
{
	System.out.println("Method is being called");
	int a = 1;
	int sum = 0;
	while (a <= 100)
	{
		sum = sum+a;
		a = a+1;
		
	}
	System.out.println(sum);
}

public static int sumAll(int n)
{
 System.out.println("method by callng interger"+ n);
 int i = 1;
 int sum = 0;
 while (i <= n)
 {
	 sum = sum + i;
	 i = i+1;
 }
 return sum;
//System.out.println(sum);
}

}
	

