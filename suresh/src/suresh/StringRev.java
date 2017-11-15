package suresh;

public class StringRev {

	public static void main(String[] args) {
		String original = "Hello Class";
		String reverse = "";
		//for(int i=0;i<original.length();i++)
		//{
		//	System.out.println(original.charAt(i));
		//}
		for (int j=original.length()-1;j>=0;j--)
		{
			reverse = reverse+original.charAt(j);
		}
			System.out.println(reverse);
			String res = reverse+"abcd";
			System.out.println(res);
		

	}

}
