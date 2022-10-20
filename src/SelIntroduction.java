import java.util.ArrayList;

public class SelIntroduction {

	public static void main(String[] args) {
		System.out.println("Hello");

		
	
		 for(int i = 1;i<=6;i++) {
		  
		 for(int j = 6;j>= i;j--)
		 { System.out.print("*");
		
		 } System.out.println(); }
		
		 
		
		/*
		 * int arr [] = {12,22,31,44}; for (int i :arr) { System.out.println(i);
		 * 
		 * }
		 */
		/*  
		  int i =1;
		 do {
			  System.out.println(i);
			  i++;
			  
		 }while (i<=10);*/
		 
		 int [] arr = new int [5];
		 arr[0] =2;
		 arr[1] =5;
		 arr[2] = 7;
		 arr[3] = 11;
		 arr[4] = 9;
		 
		 for (int i =0; i<arr.length;i++) {
			 System.out.println(arr[i]); 
		 }
		 

	ArrayList <String> a = new ArrayList<String> ();
	a.add("Amit");
	a.add("Bangalore");
	a.add("Selenium");
	System.out.println(a.get(2));
	
		 
		  
		 
	}

}
