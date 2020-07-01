package staticKeyword;

import staticKeyword.A.b;
import staticKeyword.A.c;

public class Person {

	public static void main(String[] args) {
		A obja = new A();
		b objb = obja.new b();
		
		c objc  = new A.c();
	}

}
