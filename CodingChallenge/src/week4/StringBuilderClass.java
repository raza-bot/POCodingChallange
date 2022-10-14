package week4;

public class StringBuilderClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder s = new StringBuilder(); 
		System.out.println(s.capacity());
		s.append("Saba"); 
		s.insert(4, " Khan"); 
		System.out.println(s.toString());
		s.replace(0, 4, "Raza"); 
		System.out.println(s.toString());
		
		System.out.println(s.reverse().toString());
		
		

	}

}
