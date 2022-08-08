package com.package1;

class bike {
	final void run() {
		System.out.println("Bike");
	}
}

class Final extends bike {

	public static void main(String[] args) {
		Final b = new Final();
		b.run();
	}

}
