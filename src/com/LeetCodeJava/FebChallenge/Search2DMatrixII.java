package com.LeetCodeJava.FebChallenge;

public class Search2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int r = 0;
        int c = cols - 1;

        while (r < rows && c >= 0) {
            if (target > matrix[r][c]){
                r++;
            } else if(target < matrix[r][c]) {
                c -= 1;
            } else {
                return true;
            }
        }

        return false;
    }

    public void testRunner(){

        int arr[][] = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 5;
        System.out.println(searchMatrix(arr, target));
    }
}
