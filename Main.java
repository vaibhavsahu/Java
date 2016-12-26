package com.vaibhavsahu.BFS;

public class Main {

    public static void main(String[] args) {
	// write your code here

        BreadthFirstSearch bfs = new BreadthFirstSearch();

        //create vertices in the graph

        vertex vertex1 = new vertex(1);
        vertex vertex2 = new vertex(2);
        vertex vertex3 = new vertex(3);
        vertex vertex4 = new vertex(4);
        vertex vertex5 = new vertex(5);

        //prepare adjacancy list of vertices

        vertex1.addNeighbor(vertex2);
        vertex1.addNeighbor(vertex4);
        vertex4.addNeighbor(vertex5);
        vertex2.addNeighbor(vertex3);

        //run bfs on the graph

        bfs.doDFS(vertex1);



    }
}
