package Week5;

public class ValidPin {

	
	
	public static boolean isValidPin(String s) {
		return s.matches("^([0-9]{4}|[0-9]{6})$"); 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isValidPin("123456"));

	}
}
