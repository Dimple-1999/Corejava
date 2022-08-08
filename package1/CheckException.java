package com.package1;

class NameLength extends Exception {
	@Override
	public String toString() {
		return "you have not enter either first or second name";
	}
}

public class CheckException {

	public static void main(String[] args) {
		String s1 = "Thoutu";
		String s2 = "Chandrika";
		try {
			if (s1 == null && s2 == null) {
				throw new NameLength();
			} else
				System.out.println(s1 + " " + s2);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
