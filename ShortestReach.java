/*
https://www.hackerrank.com/challenges/bfsshortreach
Author: Vaibhav Sahu
*/

package com.vaibhav.interviews;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static class Graph {
        List<List<Integer>> adjLst;
        int size;

        public Graph(int size) {
            adjLst = new ArrayList<>();
            this.size = size;
            while (size-- > 0)//Initialize the adjancency list.
                adjLst.add(new ArrayList<Integer>());
        }

        public void addEdge(int first, int second) {
            adjLst.get(first).add(second);
            adjLst.get(second).add(first);
        }

        public int[] ShortestReach(int startId) {
            LinkedList<Integer> queue = new LinkedList<Integer>();
            queue.add(startId);

            int[] distances = new int[adjLst.size()];
            Arrays.fill(distances, -1);
            distances[startId] = 0;
            HashSet<Integer> seen = new HashSet<>();
            seen.add(startId);

            while (!queue.isEmpty()) {
                int node = queue.poll();
                for (int neighbor : adjLst.get(node)) {
                    if (distances[neighbor] == -1) {
                        distances[neighbor] = distances[node] + 6;
                        queue.add(neighbor);
                    }
                }
            }
            return distances;
        }

        public static void printDistances(int[] distances, int startId) {
            String separator = "";
            for (int i = 0; i < distances.length; i++) {
                if (i == startId) continue;
                System.out.print(separator + distances[i]);
                separator = " ";
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String read;
        StringTokenizer st;

        ArrayList<ArrayList<Integer>> listoflist = new ArrayList<ArrayList<Integer>>();
        while ((read = bufferedReader.readLine()) != null && read.length() >= 1) {
            st = new StringTokenizer(read, " ");
            ArrayList<Integer> list = new ArrayList<Integer>();
            while (st.hasMoreTokens()){
                list.add(Integer.parseInt(st.nextToken()));
            }
            listoflist.add(list);
        }


        int loop = listoflist.get(0).get(0);
        Graph graph = new Graph(listoflist.get(1).get(0));
        for(int i = 0; i < loop; i++){
            int numEdges = listoflist.get(1).get(1);
            for(int j = 0; j < numEdges; j++){
                graph.addEdge(listoflist.get(j+2).get(0), listoflist.get(j+2).get(1));
            }
            int startId = listoflist.get(listoflist.get(1).get(1)+2).get(0)-1;
            graph.printDistances(graph.ShortestReach(startId), startId);
        }
    }
}
