package com.package1;

import java.util.*;

public class VecLinkStk {

	public static void main(String[] args) {
		// vector operations
		Vector<String> v1 = new Vector<String>();
		v1.add("Mahesh");
		System.out.println("Vector : " + v1);
		v1.add("Sairam");
		System.out.println("Vector : " + v1);

		// linkedlist operations
		LinkedList<String> a1 = new LinkedList<String>();
		a1.add("Chandrika");
		System.out.println("LinkedList : " + a1);
		a1.addFirst("Hello");
		System.out.println("LinkedList : " + a1);
		a1.addLast("Dimple");
		System.out.println("LinkedList : " + a1);
		a1.remove(1);
		System.out.println("LinkedList : " + a1);
		a1.contains("Hello");
		System.out.println("LinkedList : " + a1);
		a1.indexOf("Dimple");
		System.out.println("LinkedList : " + a1);
		a1.get(1);
		System.out.println("LinkedList : " + a1);
		Collections.sort(a1);
		System.out.println("LL : " + a1);
		a1.clear();
		System.out.println("LinkedList : " + a1);

		// stack operations
		Stack<Integer> s1 = new Stack<Integer>();
		s1.add(10);
		System.out.println("Stack : " + s1);
		s1.add(20);
		System.out.println("Stack : " + s1);
		s1.pop();
		System.out.println("Stack : " + s1);
		s1.push(15);
		System.out.println("Stack : " + s1);
		s1.peek();
		System.out.println("Stack : " + s1);
		s1.clear();
		System.out.println("Stack : " + s1);

		// Queue operations
		PriorityQueue<Integer> p1 = new PriorityQueue<>();
		p1.add(1);
		System.out.println("Q : " + p1);
		p1.offer(2);
		System.out.println("Q : " + p1);
		p1.poll();
		System.out.println("Q : " + p1);
		p1.peek();
		System.out.println("Q : " + p1);
		p1.remove(2);
		System.out.println("Q : " + p1);

		// Hashset operations
		HashSet<Integer> b1 = new HashSet<>();
		HashSet<String> b2 = new HashSet<>();
		b1.add(2);
		System.out.println("HashSet : " + b1);
		b1.add(5);
		System.out.println("HashSet : " + b1);
		b1.hashCode();
		System.out.println(b2.hashCode());

		b2.add("Sai");
		System.out.println(b2.hashCode());
		b2.add("Sai");
		System.out.println(b2.hashCode());

		// Treeset operations
		TreeSet<String> d2 = new TreeSet<String>();
		TreeSet<Integer> d3 = new TreeSet<Integer>();
		d2.add("Dimple");
		d2.add("Sai");
		d2.add("Veerasi");
		Iterator i = d2.descendingIterator();
		while (i.hasNext()) {
			System.out.println("Reverse order : " + i.next());
		}

		System.out.println("Treeset : " + d2);
		System.out.println("First element : " + d2.first());
		System.out.println("Last element : " + d2.last());
		System.out.println("First element : " + d2.pollFirst());
		System.out.println("Last element : " + d2.pollLast());
		System.out.println("Element higher than given string : " + d2.lower("Sai"));
		System.out.println("Element lower than given string  : " + d2.higher("Veerasi"));
		d3.add(20);
		d3.add(15);
		d3.add(35);
		d3.add(30);
		System.out.println("d3 : " + d3);
		System.out.println("Ceil(Highest round value) : " + d3.ceiling(12));
		System.out.println("floor(Lowest round value) : " + d3.floor(32));

		// ArrayDeque operations
		ArrayDeque<Integer> f = new ArrayDeque<Integer>();
		f.add(10);
		f.add(25);
		f.add(15);
		System.out.println("Deque : " + f);
		System.out.println("D2 : " + f.removeLast());
		System.out.println("D1 : " + f.removeFirst());
		System.out.println("First element : " + f.getFirst());
		System.out.println("Last element : " + f.getLast());
		System.out.println("First element : " + f.peekFirst());
		System.out.println("Last element : " + f.peekLast());
		System.out.println("First element : " + f.pollFirst());
		System.out.println("Last element : " + f.peekLast());
		System.out.println("Last element : " + f.offerFirst(10));
		System.out.println("Last element : " + f.offerLast(15));

	}

}
