public class Minesweeper{
	public static void main(String[] args){
		int m = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[1]);
		int k = Integer.parseInt(args[2]);
		int minesplaced = 0;
		int[][] matrix = new int[m][n];
		while ( minesplaced < k)
		{
			int i = (int) (Math.random() * m);
			int j = (int) (Math.random() * n);
			if(matrix[i][j] == -1 )
			{
				continue;
			}	
			else
			{
				matrix[i][j]=-1;
				minesplaced+=1;
				
			}
			

		}
				for(int i=0; i<m; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(matrix[i][j]==-1)
					System.out.print("*");
				else
				{	int mark = 0;
					
					if(i>0 && j>0 && matrix[i-1][j-1]==-1)
						mark+=1;
					if(i>0 && matrix[i-1][j]==-1)
						mark+=1;
					if(i>0 && j<n-1 && matrix[i-1][j+1]==-1)
						mark+=1;
					if(j>0 && matrix[i][j-1]==-1)
						mark+=1;
					if(j<n-1 && matrix[i][j+1]==-1)
						mark+=1;
					if(i<m-1 && j>0 && matrix[i+1][j-1]==-1)
						mark+=1;
					if(i<m-1 && matrix[i+1][j]==-1)
						mark+=1;
					if(i<m-1 && j<n-1 && matrix[i+1][j+1]==-1)
						mark+=1;
					System.out.print(mark);
				}
				if(j!=n-1)
					System.out.print(" ");
			
			}
			if(i!=m-1)
				System.out.println("");	
			
		}
	}
}
