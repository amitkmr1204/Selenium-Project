
public class JavaBrushup1 {

	public static void main(String[] args) {
		String s = "Bangalore";
		String s1 = "Bangalore";

		String s2 = new String("Hello");
		String s3 = new String("Hello");

		String s4 = "Amit Kumar Bangalore";
		String[] splittedstring = s4.split("Kumar");

		for (int i = 0; i < splittedstring.length; i++) {

			System.out.println(splittedstring[i]);

		}

		System.out.println(splittedstring[0]);
		System.out.println(splittedstring[1]);
		System.out.println(splittedstring[1].trim());

		for (int k = s4.length() - 1; k >= 0; k--) {
			System.out.println(s4.charAt(k));

		}

	}

}
