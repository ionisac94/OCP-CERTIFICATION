package com.md.example.ocp.generics_and_collections.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
	public static void main(String[] args) {
		Deque<Integer> deque = new ArrayDeque<>();

//		deque.offer(1);
//		deque.offer(2);
//		deque.offer(3);
//
//		for (Integer x : deque) {
//			System.out.println(x);
//		}


		deque.push(1);
		deque.push(2);
		deque.push(3);

		Integer integer = deque.pollFirst();

		for (Integer x : deque) {
			System.out.println(x);
		}

	}

}

class StackDeque {

	public static void main(String[] args) {
		Deque<Integer> d = new ArrayDeque<>();
		d.push(1);
		d.push(2);
		d.push(3);

		System.out.println(d.pollFirst());
		System.out.println(d.poll());// does not thrown an exception if the stack is empty, similar pop()
		System.out.println(d.pollLast());

//		System.out.println(d.peek()); retrieves and not remove the firs element of the stack

//		System.out.println(d.pop()); trows an exception if the list is empty
	}
}

class QueueDeque {

	public static void main(String[] args) {
		Deque<Integer> d = new ArrayDeque<>();
		d.offer(1);// does not throw an exception
		d.offer(2);
		d.add(3);//throws an exception
		for (Integer x : d) {
			System.out.println(x);
		}

	}
}

