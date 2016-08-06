package cd.tictactoe;

import java.util.Scanner;

public class Player
{
	String name;
	Character sign;
	int rowChoice;
	int colChoice;
	Player(Character sign,String name)
	{
		this.sign=sign;
		this.name=name;
	}
	public void	chooseMove(String name)
	{
		Scanner input = new Scanner(System.in);
		System.out.println(name+" enter row :");
		this.rowChoice=input.nextInt();
		System.out.println(name+" enter col :");
		this.colChoice=input.nextInt();
		
	}
	public void makeMove(Board board,int r,int c,Character sign)
	{
		board.board[r][c]=sign;
	}
}
