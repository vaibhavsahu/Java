package com.vaibhavsahu.BFS;

import java.util.ArrayList;

/**
 * Created by vaibhavsahu on 12/25/16.
 */
public class vertex {
    private int data;
    private boolean visited;
    private ArrayList<vertex> neighborList;


    public vertex(int x){
        this.data = x;
        this.neighborList = new ArrayList<>();
    }

    public void addNeighbor(vertex v){
        this.neighborList.add(v);
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public ArrayList<vertex> getNeighborList() {
        return neighborList;
    }

//    public void setNeighborList(ArrayList<vertex> neighborList) {
//        this.neighborList = neighborList;
//    }


    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
