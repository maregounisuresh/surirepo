package suresh;

public class StringDemo2 {

	public static void main(String[] args) {
		String fpath = "C:\\Users\\Public\\Documents\\.jpeg-";
		//int index = fpath.indexOf(".");
		//String ftype = fpath.substring(index);
		//System.out.println(ftype);
		String ftype = fpath.substring(fpath.indexOf("."));
		System.out.println(ftype);
		if (ftype.equalsIgnoreCase(".xls") || ftype.equalsIgnoreCase(".xlsx"))
				System.out.println("Excel Workbook");
		
		else if (ftype.equalsIgnoreCase(".doc") || ftype.equalsIgnoreCase(".ods"))
			System.out.println("Word Document");
		else if (ftype.equalsIgnoreCase(".jpeg"))
			System.out.println("Image");
	}

}
