package com.package1;
//using return statement

/*class Father {
	public String s = "Shyam sunder";

	public String display() {

		return s;
	}
}

class Child extends Father {
	@Override
	public String display() {
		System.out.println(super.display());
		return "Chandrika D/O Shyam sunder";
	}
}

public class MethodOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child f = new Child();
		System.out.println(f.display());
		;
	}

}*/


//using SOP statement
class Father {
	public String s = "Shyam sunder";

	public void display() {

		System.out.println(s);
		;
	}
}

class Child extends Father {
	@Override
	public void display() {
		super.display();
		System.out.println("Chandrika D/O Shyam sunder");

	}
}

public class MethodOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child f = new Child();
		f.display();
		
	}
}
