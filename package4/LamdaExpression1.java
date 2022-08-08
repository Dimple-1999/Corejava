package com.package4;
//Lamda with parameters
public class LamdaExpression1 {

	public static void main(String[] args) {
		FnInterface1 ref = (str) -> {
			String result = "Dimple";
			for (int i = str.length() - 1; i >= 0; i--) {
				result += str.charAt(i);

			}
			return result;
		};

	}

}
