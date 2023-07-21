package com.day9.java;

public class Two_D_Arrays {

	public static void main(String[] args) {
	//[][]
		
		int[][] a;
		int a3[][];
		int [][]a1;
		int[][]a2; 
		int[]a4[];
		
		int[][] b, b1; //both are 2-D
		int[] c[], c1; //c is 2-D, c1 is 1-D
		int[] d[], d1[]; //both are 2-D
		// int[][]e, []e1; //the law of arrays in java - it says the 2nd variable cannot have a dimension before it. It is allowed only after
		int[][]e, e1[]; //e is 2-D, e1 is 3-D
		int[]f[], f1[]; //f and f1 both are 2-D
		
		int[][] g = new int[3][4]; //this is a 3X4 matrix = 3 rows and 4 cols
		g[0][0] = 5;
		g[0][1] = 10;
		g[0][2] = 15;
		g[0][3] = 20;
		
		g[1][0] = 15;
		g[1][1] = 105;
		g[1][2] = 155;
		g[1][3] = 205;
		
		g[2][0] = 155;
		g[2][1] = 1045;
		g[2][2] = 1565;
		g[2][3] = 2065;
		
		System.out.println(g.length); // in a multi-dim array, the length member will represent rows
		
		int[][] g1 = { {1,2,3,4} , {5,6,7,8}, {9,10,11,12} };
		
		for(int i=0 ; i<g1.length ; i++) {
			for(int j=0 ; j<g1[i].length ; j++) {
				System.out.print(g1[i][j] + " ");
			}
			
			System.out.println();
		}
		
		
		
	}

}
