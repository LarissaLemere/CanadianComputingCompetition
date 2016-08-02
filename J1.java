/*
		Problem J1: Tournament Selection
		Problem Description
		Each player in a tournament plays six games. There are no ties. 
		The tournament director places the players in groups based on the results 
		of games as follows:
			¥ if a player wins 5 or 6 games, they are placed in Group 1;
			¥ if a player wins 3 or 4 games, they are placed in Group 2;
			¥ if a player wins 1 or 2 games, they are placed in Group 3;
			¥ if a player does not win any games, they are eliminated from the tournament.
		Write a program to determine which group a player is placed in.

		Input Specification
	The input consists of six lines, each with one of two possible letters: W (to indicate a win) or L (to indicate a loss).

		Output Specification
	The output will be either 1, 2, 3 (to indicate which Group the player should be placed in) or -1 (to indicate the player has been eliminated).

	Sample Input 1
		W 
		L 
		W
		W 
		L 
		W
	Output for Sample Input 1
		2

	Sample Input 2
		L
		L 
		L 
		L 
		L 
		L
	Output for Sample Input 2
		-1
 */
//Larissa Lemere
// CCC J1
import java.util.*;
public class J1 {
	private static int count1=0;
	private static int count2=0;
	public static void main(String[] args) {
		output();
		int outputint;
		if(count1<1){
			outputint=-1;
		}
		else if(count1<3){
			outputint=3;
		}
		else if(count1<5){
			outputint=2;
		}
		else{
			outputint=1;
		}
		System.out.println(outputint);
	}
	public static void output(){
		Scanner sc = new Scanner(System.in);
		String b = sc.nextLine();
		char a=b.charAt(0);
		if(a=='W'){
			count1++;
		}
		else{
			count2++;
		}
		
		if(count1+count2<6){
			output();
		}
	}

}
