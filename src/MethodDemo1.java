
public class MethodDemo1 {

	public static void main(String[] args) {
		MethodDemo1 d1 = new MethodDemo1();
		String name = d1.getdata();
		System.out.println(name);
		getdata1();
		MethodDemo2 d2 = new MethodDemo2();
		d2.getdata3();
		
		
		
}
	
	public String getdata() {
		System.out.println("Hello World");
		return "Bagalore";
	}
	
	public static void getdata1() {
		System.out.println("Hello");
	}
	
	
	

}
