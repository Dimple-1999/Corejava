package com.corejavapart1;

public class StringBuildOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("Hello Chandrika");
		System.out.println("Length--->" + sb.length());
		System.out.println("Capacity--->" + sb.capacity());
		System.out.println("Character of given index value--->" + sb.charAt(9));
		System.out.println("Index--->" + sb.indexOf("C"));
		System.out.println("LastIndex--->" + sb.lastIndexOf("i"));
		System.out.println("Substring--->" + sb.substring(6));
		System.out.println("Substring--->" + sb.substring(5, 12));
		System.out.println("to string--->" + sb.toString());
		System.out.println("appends=joins--->" + sb.append(" Thoutam"));
		System.out.println("Deletion--->" + sb.delete(3, 7));
		System.out.println("Equals--->" + sb.equals(sb));
		System.out.println("Reverse--->" + sb.reverse());
	}

}
