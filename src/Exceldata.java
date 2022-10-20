import java.io.IOException;
import java.util.ArrayList;

public class Exceldata {

	public static void main(String[] args) throws IOException {

		ExcelDataDriven ex = new ExcelDataDriven();
		
		ArrayList data = ex.getdata("Create Profile");
		
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));
		
		

	}

}
