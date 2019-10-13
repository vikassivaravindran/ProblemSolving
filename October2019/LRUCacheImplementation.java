package com.vikas.learningtocode;

import java.util.HashMap;
import java.util.Map;

public class LRUCacheImplementation {

	Node first;
	Node last;
	int CacheSize;
	int maxSize;
	public static Map<Integer, Node> cache;

	public LRUCacheImplementation(int size) {
		this.CacheSize = size;
		cache = new HashMap<Integer, Node>();
	}

	static class Node {

		int key;
		int value;
		Node next;
		Node previous;

		public Node(int key, int value) {
			this.key = key;
			this.value = value;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LRUCacheImplementation lruCache = new LRUCacheImplementation(4);
		lruCache.insert(1, 1);
		lruCache.insert(2, 2);
		lruCache.insert(3, 3);
		lruCache.insert(1, 4);
		System.out.println(lruCache.getKey(2));
		System.out.println(lruCache.getKey(1));
		lruCache.insert(3, 5);
		System.out.println(lruCache.getKey(3));

	}

	private int getKey(int key) {

		if (!cache.containsKey(key)) {
			return -1;
		}
		Node n = cache.get(key);
		removefromLast(n);
		addtoFront(n);
		return n.value;

	}

	private void insert(int key, int value) {
		// TODO Auto-generated method stub
		if (!cache.containsKey(key)) {
			
			if (this.maxSize == this.CacheSize) {
				removefromLast(last);
				this.maxSize --;
			}

			Node n = new Node(key, value);
			addtoFront(n);
			cache.put(key, n);
			this.maxSize++;
			
		} else {
			
			Node n = cache.get(key);
			n.value = value;
			removefromLast(n);
			addtoFront(n);
		}
	
	}

	private void removefromLast(Node node) {
		// TODO Auto-generated method stub
	// Another method to remove Node.
	/*if(node.previous != null) {
			node.previous.next = node.next;
		}else {
			first = node.next;
		}
		
		if(node.next != null) {
			node.previous.next = node.next;
		}else {
			last = node.previous;
		}*/
		
			// Another way to implement Deleting the node at back.
		if(node == first) {
			first = node.next;
			first.previous = null;
		}
		else if(node == last) {
			last = node.previous;
			last.next = null;
		}
		else {
			node.previous.next = node.next;
			node.next.previous = node.previous;
		}
		
	}

	private void addtoFront(Node n) {
		// TODO Auto-generated method stub
		if (first == null && last == null) {
			first = n;
			last = n;
		} else {
			first.previous = n;
			n.next = first;
			n.previous  = null;
			first = n;
		}
	}

}
