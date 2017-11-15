package suresh;

public class Constructor {
	public int rollno;
	public static String college;
	public String sname;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor s1 = new Constructor();
		s1.rollno = 11;
		s1.sname = "suresh";
		s1.college = "Mind";
		Constructor s2 = new Constructor();
		s2.rollno = 12;
		s2.sname = "Maregouni";
		s2.college = "U";
		System.out.println(s1.sname);
		System.out.println(s2.sname);

	}

}
