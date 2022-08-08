package com.package3;

import java.util.Queue;

class Consumer extends Thread {
	private volatile Queue<String> sharedQueue;
	private volatile boolean bExit;

	public Consumer(Queue<String> myQueue, boolean bExit) {
		this.sharedQueue = myQueue;
		this.bExit = bExit;
	}

	public void run() {
		while (!bExit) {
			synchronized (sharedQueue) {
				while (!sharedQueue.isEmpty()) {
					String item = sharedQueue.poll();
					System.out.println("Consumer removed : " + item);
					System.out.println("Consumer notifying producer : " + item);
					sharedQueue.notify();
				}
			}
		}
	}
}
