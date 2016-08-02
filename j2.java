/*
Problem J2: Magic Squares
		Problem Description
	Magic Squares are square arrays of numbers that have the interesting property that the numbers in each column, 
	and in each row, all add up to the same total. Given a 4 x 4 square of numbers, determine if it is magic square.

	 	Input Specification
	The input consists of four lines, each line having 4 space-separated integers.

		Output Specification
	Output either magic if the input is a magic square, or not magic if the input is not a magic square.

	Sample Input 1
		16 3 2 13
		5 10 11 8
		9 6 7 12
		4 15 14 1
	Output for Sample Input 1
		magic
	Explanation for Output for Sample Input 1
		Notice that each row adds up to 34, and each column also adds up to 34.

	Sample Input 2
		5 10 1 3 
		10 4 2 3 
		1 2 8 5 
		3 3 5 0
	Output for Sample Input 2
		not magic
	Explanation for Output for Sample Input 2
		Notice that the top row adds up to 19, but the rightmost column adds up to 11.*/
// Larissa Lemere
// CCC J2
import java.util.*;
public class j2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [][] box = new int[4][4];
		for(int i=0; i<4; i++){
			for(int j=0; j<4; j++){
				box[i][j]=sc.nextInt();
			}
		}
		int total=0;
		int total2=0;
		for(int i=0; i<4; i++){
			total+=box[0][i];
		}
		for(int i=0; i<4; i++){
			for(int j=0; j<4; j++){
				total2+=box[i][j];
			}
			if(total!=total2){
				System.out.println("not magic");
				return;
			}
			total2=0;
		}
		for(int i=0; i<4; i++){
			for(int j=0; j<4; j++){
				total2+=box[i][j];
			}
			if(total!=total2){
				System.out.println("not magic");
				return;
			}
			total2=0;
		}
		System.out.println("magic");
		
	}

}
