package HelloMe;

import java.util.Scanner;

public class helloClass {
	
	public static void main(String[] args) {
		String yourName = "";
		helloMe(yourName);
	}
	
	public static void helloMe(String yourName) {
		Scanner userName = new Scanner(System.in);
		System.out.println("Your name is: " );
		yourName = userName.next();
		System.out.println("Hello " + yourName);
		
	}

}
