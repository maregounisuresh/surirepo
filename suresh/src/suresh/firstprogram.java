package suresh;

public class firstprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before calling Method");
		sumall();
		System.out.println(sumall(20));
		System.out.println("after calling method");
		
	}
						
		public static void sumall()
		{
			int i=1;
			int sum=0;
			while(i<=5)
			{
				sum=sum+i;
				i=i+1;
				
			}
			System.out.println(sum);
			
		}
		
		public static int sumall(int n)
		{
			System.out.println("hi");
			int a=1;
			int sum=0;
			while(a<=n)
			{
				sum=sum+a;
				a=a+1;
			}
			return sum;
		
		}
}
	


