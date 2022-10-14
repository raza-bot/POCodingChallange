package week4;

import java.time.LocalDate;
import java.util.stream.Stream;

interface Sample{  
    void print();  
}  
public class MethodReference {  
    public static void printhello(){  
        System.out.println("Hello, this is static method.");  
    } 
    
    //map values
    public static String interpret(String command) {
        String goalParser = ""; 
        for(int i = 0; i < command.length(); i++) {
            if(command.charAt(i) == 'G') {
                goalParser = goalParser.concat("G");
            }else if(command.substring(i,i+2).equals("()")) {
                goalParser = goalParser.concat("o"); 
                i++; 
            }else {
            	goalParser = goalParser.concat("al"); 
            	i = i + 3;
            }
        }
        return goalParser; 
    }
    
    
    
    public static void main(String[] args) {  
        // Line 9
    	Sample sample = MethodReference::printhello;
    	Stream<String> s = Stream.of("java", "SQL", "python",  "JDBC");
    	s.filter(x -> x.startsWith("S")).forEach(System.out::print);
        
    	
    	Stream.iterate(1, element->element+1)  
        .filter(element->element%2==0)  
        .limit(4)  
        .forEach(System.out::println);  
    	System.out.println(LocalDate.now());
    	
    	String command = "G()(al)";
    	System.out.println(interpret(command));
    
    }  
} 