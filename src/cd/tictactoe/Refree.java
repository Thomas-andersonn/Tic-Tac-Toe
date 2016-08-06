package cd.tictactoe;

public class Refree
{
	int checkValidMove(Board board,int r,int c,Character sign)
	{
		if(r<=2&&r>=0&&c<=2&&c>=0)
		{
			if(board.board[r][c]==null)
			{
				return 1;
			}
			else
			{
				System.out.println("Invalid move");
				return 0;
			}
		}
		else
		{
			System.out.println("Invalid move");
			return 0;
		}
	}
	int checkWin(Board board,String name,Character sign)
	{
		if(board.board[0][0]==sign&&board.board[0][1]==sign&&board.board[0][2]==sign)
		{
			System.out.println(name+" is the winner");
			return 1;
		}
		else if(board.board[1][0]==sign&&board.board[1][1]==sign&&board.board[1][2]==sign)
		{
			System.out.println(name+" is the winner");
			return 1;
		}
		else if(board.board[2][0]==sign&&board.board[2][1]==sign&&board.board[2][2]==sign)
		{
			System.out.println(name+" is the winner");
			return 1;
		}
		else if(board.board[0][0]==sign&&board.board[1][0]==sign&&board.board[2][0]==sign)
		{
			System.out.println(name+" is the winner");
			return 1;
		}
		else if(board.board[0][1]==sign&&board.board[1][1]==sign&&board.board[2][1]==sign)
		{
			System.out.println(name+" is the winner");
			return 1;
		}
		else if(board.board[0][2]==sign&&board.board[1][2]==sign&&board.board[2][2]==sign)
		{
			System.out.println(name+" is the winner");
			return 1;
		}
		else if(board.board[0][0]==sign&&board.board[1][1]==sign&&board.board[2][2]==sign)
		{
			System.out.println(name+" is the winner");
			return 1;
		}
		else if(board.board[0][2]==sign&&board.board[1][1]==sign&&board.board[2][0]==sign)
		{
			System.out.println(name+" is the winner");
			return 1;
		}
		else
		{
			return 0;
		}
			
	}
	void clearBoard(Board board)
	{
		Character[][] newboard = new Character[3][3];
		board.board=newboard;
	}
}
