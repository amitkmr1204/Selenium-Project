import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

public class JavaStreamExample {

	public static void main(String[] args) {

		ArrayList<Integer> num1 = new ArrayList<>();
		num1.add(10);
		num1.add(20);
		num1.add(5);
		num1.add(3);
		num1.add(25);
		num1.add(3);
		num1.add(25);
		num1.add(10);
		
		num1.stream().distinct().forEach(s->System.out.println(s));
	List<Integer> values =	num1.stream().distinct().sorted().collect(Collectors.toList());
	System.out.println(values.get(2));
		
		
		  List<String> name = List.of("Akash", "Amit", "Gaurav", "Abhishek", "Rohit","Abhimanyu");
		  int count =0;
		  for(int i=0;i<name.size();i++) {
			  String name1 = name.get(i);
			  if (name1.startsWith("A")) {
				  count++;
				 
			  }
			  
			  
		  }
		  System.out.println(count);
		  
	long namecount = name.stream().filter(s->s.startsWith("A")).count();
	System.out.println(namecount);
	
	List<String> name1 =name.stream().collect(Collectors.toList());
	System.out.println(name1);
	List<String> name2 = name.stream().filter(s->s.startsWith("A")).collect(Collectors.toList());
	System.out.println(name2);
	
	name.stream().filter(s->s.startsWith("A")).sorted().forEach(s->System.out.println(s));
	name.stream().filter(s->s.length()==4).forEach(s->System.out.println(s));
	name.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
	Stream.of("Akash", "Amit", "Gaurav", "Abhishek", "Rohit","Abhimanyu").filter(s->s.endsWith("t")).map(s->s.toUpperCase())
	.forEach(s->System.out.println(s));
	
	
	String[] city = {"Bangalore", "Chennai","Pune","Delhi","Patna"};
	
	List<String> city1 = Arrays.asList(city);
	
	Arrays.asList(city).stream().filter(s->s.startsWith("P")).sorted().map(s->s.toLowerCase()).forEach(s->System.out.println(s));
	
	Stream<String> newStream = Stream.concat(name.stream(), city1.stream());
	boolean flag =newStream.anyMatch(s->s.equalsIgnoreCase("amit"));
	System.out.println(flag);
	
	Assert.assertTrue(flag);
	
List<String> name11 =	name.stream().filter(s->s.startsWith("A")).map(s->s.toUpperCase()).collect(Collectors.toList());

System.out.println(name11.get(1));
	
	
		  
		 /* name.stream().filter(i -> i.startsWith("A")).forEach(i ->System.out.println(i)); 
		  List<String> name11 = name.stream().filter(i ->i.startsWith("A")).sorted().collect(Collectors.toList());
		  System.out.println(name11);
		  
		  System.out.println(num1);
		 

		// for (Integer num:num1) {
		// System.out.println(num);
		// }

		List<Integer> num2 = num1.stream().collect(Collectors.toList());
		System.out.println(num2);

		List<Integer> num3 = num1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(num3);
	*/
	}
}
