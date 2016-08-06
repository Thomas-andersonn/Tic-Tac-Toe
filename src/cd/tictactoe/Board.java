package cd.tictactoe;

public class Board
{
	Character[][] board=new Character[3][3];
	static Board boardObject;
	private Board()
	{
		
	}
	public static Board getBoard()
	{
		if(boardObject==null)
		{
			boardObject= new Board();
		}
		return boardObject;
		
	}
	void display()
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(board[i][j]==null)
					System.out.print("_"+"\t"+"|"+"\t");
				else
				System.out.print(board[i][j]+"\t"+"|"+"\t");
				
			}
			System.out.print("\n----------------------------------------------\n");
		}
	}
}
