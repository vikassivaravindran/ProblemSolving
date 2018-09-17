package com.vikas.practice;

import java.util.Iterator;
import java.util.LinkedList;


/* Java Program to do Breadth First Traversal */
public class BFSGraph {

	int V;

	public LinkedList<Integer> adj[];

	boolean visited[];

	@SuppressWarnings("unchecked")
	public BFSGraph(int size) {
		this.V = size;
		adj = new LinkedList[V];
		visited = new boolean[V];

		for (int i = 0; i < V; i++) {
			adj[i] = new LinkedList<>();
			visited[i] = false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BFSGraph graph = new BFSGraph(4);

		graph.add(0, 1);
		graph.add(0, 2);
		graph.add(1, 2);
		graph.add(2, 0);
		graph.add(2, 3);
		graph.add(3, 3);

		System.out.println("The Breadth First Traversal is:::");
		graph.BFS(2);
	}

	private void BFS(int src) {
		// TODO Auto-generated method stub
		LinkedList<Integer> queue = new LinkedList<>();

		visited[src] = true;

		queue.add(src);

		while (!queue.isEmpty()) {

			src = queue.poll();
			System.out.print(src + " ");

			Iterator<Integer> itr = adj[src].listIterator();
			while (itr.hasNext()) {
				int n = itr.next();
				if (!visited[n]) {
					visited[n] = true;
					queue.add(n);
				}
			}

		}

	}

	private void add(int src, int dest) {
		// TODO Auto-generated method stub
		adj[src].add(dest);

	}

}
