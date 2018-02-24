import java.util.Scanner;

public class J4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int lines = 0;
		int degrees = 0;
		
		lines = s.nextInt();
		
		int[][] grid = new int[lines][lines];
		int[][] grid2 = new int[lines][lines];
		int[][] grid3 = new int[lines][lines];
		int[][] grid4 = new int[lines][lines];
		int[][] gridsubmit = new int[lines][lines];
		
		//inputs
		for (int a = 0; a < lines; a++) {
			for (int b = 0; b < lines; b++) {
				grid[a][b] = s.nextInt();
			}
		}
		
		int min = 100000000;
		
		for (int a = 0; a < lines; a++) {
			for (int b = 0; b < lines; b++) {
				min = Math.min(min, grid[a][b]);
				//System.out.print(min);
			}
		}
		
		
		
		for (int c = 0; c < lines; c++) {
			for (int d = 0; d < lines; d++) {
				if (grid[lines-1][0] == min) {
					degrees = 180;
				} else if (grid[0][lines-1] == min) {
					degrees = 90;
				} else if (grid[lines-1][lines-1] == min) {
					degrees = 360;
				} else {
					degrees = 0;
				}

			}
		}
		
		//for 90
		if (degrees == 90) {
			for (int e = 0; e < lines; e++) {
				for (int f = 0; f < lines; f++) {
					grid2[e][f] = grid[f][lines-e-1];
				}
			}
		} else if (degrees == 180) {
			for (int e = 0; e < lines; e++) {
				for (int f = 0; f < lines; f++) {
					grid2[e][f] = grid[f][lines-e-1];
				}
			}
			for (int e = 0; e < lines; e++) {
				for (int f = 0; f < lines; f++) {
					grid3[e][f] = grid2[f][lines-e-1];
				}
			}
			for (int e = 0; e < lines; e++) {
				for (int f = 0; f < lines; f++) {
					grid4[e][f] = grid3[f][lines-e-1];
				}
			}
		} else if (degrees == 360) {
			for (int e = 0; e < lines; e++) {
				for (int f = 0; f < lines; f++) {
					grid2[e][f] = grid[f][lines-e-1];
				}
			}
			for (int e = 0; e < lines; e++) {
				for (int f = 0; f < lines; f++) {
					grid3[e][f] = grid2[f][lines-e-1];
				}
			}
		}
		
		//submit
		if (degrees == 0) {
			for (int e = 0; e < lines; e++) {
				for (int f = 0; f < lines; f++) {
					gridsubmit[e][f] = grid[e][f];
				}
			}
		} else if (degrees == 90) {
			for (int e = 0; e < lines; e++) {
				for (int f = 0; f < lines; f++) {
					gridsubmit[e][f] = grid2[e][f];
				}
			}
		} else if (degrees == 180) {
			for (int e = 0; e < lines; e++) {
				for (int f = 0; f < lines; f++) {
					gridsubmit[e][f] = grid4[e][f];
				}
			}
		} else if (degrees == 360) {
			for (int e = 0; e < lines; e++) {
				for (int f = 0; f < lines; f++) {
					gridsubmit[e][f] = grid3[e][f];
				}
			}
		}
		for (int e = 0; e < lines; e++) {
			for (int f = 0; f < lines; f++) {
				System.out.print(gridsubmit[e][f]);
				if (f != lines-1) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
