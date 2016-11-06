/*
This sample code will let the user read the input into a 2D array myarray
Author: Vaibhav Sahu

*/


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int myarray[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                myarray[i][j] = in.nextInt();
            }
        }
    }
}
