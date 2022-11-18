/*************************************************************************
 *  Compilation:  javac RURottenTomatoes.java
 *  Execution:    java RURottenTomatoes
 *
 *  @author:
 *
 * RURottenTomatoes creates a 2 dimensional array of movie ratings 
 * from the command line arguments and displays the index of the movie 
 * that has the highest sum of ratings.
 *
 *  java RURottenTomatoes 3 2 5 2 3 3 4 1
 *  0
 *************************************************************************/

public class RURottenTomatoes {

    public static void main(String[] args) {

		int r = Integer.parseInt(args[0]);
		int c = Integer.parseInt(args[1]);

		int[][] reviews = new int[r][c];
		int skip = 2;
		int sum = 0;
		int minVal = Integer.MIN_VALUE;
		int column = 0;

		for (int i = 0; i < reviews.length; i++){
			for (int j = 0; j < reviews[i].length; j++){
				reviews[i][j] = Integer.parseInt(args[skip]);
				skip++;
			}
		}
		
		for ( int i = 0; i <reviews[0].length; i++){
			for (int j = 0; j < reviews.length; j++){
				sum += reviews[j][i];
			}
			if (sum > minVal){
				minVal = sum;
				column = i;
			}
			sum = 0;
		}
		System.out.println(column);
	}
}
