package cd.tictactoe;

public class Main
{

	public static void main(String[] args)
	{
		int isWin=0,count=0,flag=0;
		Board board=Board.getBoard();
		Player player1=new Player(new Character('X'),"player1");
		Player player2=new Player(new Character('O'),"player2");
		Player moveHolder=player1;
		Refree refree=new Refree();
		while(isWin!=1&&count<9)
		{
			while(flag==0)
			{
				moveHolder.chooseMove(moveHolder.name);
				flag=refree.checkValidMove(board, moveHolder.rowChoice,moveHolder.colChoice , moveHolder.sign);
			}
			flag=0;
			moveHolder.makeMove(board, moveHolder.rowChoice, moveHolder.colChoice, moveHolder.sign);
			board.display();
			isWin=refree.checkWin(board,moveHolder.name,moveHolder.sign);
			if(moveHolder==player1)
				moveHolder=player2;
			else
				moveHolder=player1;
			count++;
		}
		if(count==9&&isWin==0)
		{
			System.out.println("The game is a draw");
		}
		
	}

}
