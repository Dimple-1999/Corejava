package com.corejavapart1;

public class StringBufferOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Veerasi");
		System.out.println("appends:" + sb.append(" Thoutu"));
		System.out.println("Equal of string buffer:" + sb.equals(sb));
		System.out.println("Length:" + sb.length());
		System.out.println("Replace:" + sb.charAt(5));
		System.out.println("Index value:" + sb.indexOf("r"));
		System.out.println("Last index value:" + sb.lastIndexOf("a"));
		System.out.println("Capacity:" + sb.capacity());
		System.out.println("" + sb.toString());
		System.out.println("Deletion:" + sb.delete(4, 5));
		System.out.println("Insertion:" + sb.insert(6, "Veerasi"));
		System.out.println("substring from the given index value:" + sb.substring(2));
		System.out.println("substring from specified index values:" + sb.substring(1, 5));
		System.out.println("Reverse the stringbuffer value:" + sb.reverse());

	}

}
