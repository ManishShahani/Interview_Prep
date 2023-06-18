https://leetcode.com/problems/set-matrix-zeroes/

package com.Examle;

import java.util.HashSet;

public class MatrixSetZero {
	public static void main(String[] args) {
		int [][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
		int m = matrix.length;
        int n = matrix[0].length;
        HashSet<Integer> rows = new HashSet<>();
        HashSet<Integer> cols = new HashSet<>();
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(matrix[i][j]==0){
                	rows.add(i);
                	cols.add(j);
                }
            }
            
        }
        System.out.println(rows);
        for (int row : rows) {
            for (int j = 0; j < n; j++) {
                matrix[row][j] = 0;
            }
        }
        System.out.println(cols);
        // Set the corresponding columns to 0
        for (int col : cols) {
            for (int i = 0; i < m; i++) {
                matrix[i][col] = 0;
            }
        }

        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                System.out.print(matrix[i][j]);
            }
        }


	}
}
