package com.package3;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<String>();
		boolean exit = false;
		Producer p = new Producer(q, exit);
		p.start();
		Consumer c = new Consumer(q, exit);
		c.start();
	}

}
