public class ThueMorse	{
	public static void main(String[] args)
	{
		int n = Integer.parseInt(args[0]);
		int index = 1;
		while(index<n)
		{
			index *=2;
		}
		int[] newArr;
		newArr = new int[index];
		int prevPower = 1;
		while(prevPower<index)
		{
			for(int i=0; i<(prevPower); i++)
			{
				if(newArr[i]==0)
				{
					newArr[i+prevPower]=1;
				}
				else
					newArr[i+prevPower] = 0;
			}
			prevPower*=2;
		}

		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(newArr[i]==newArr[j])
				{
					System.out.print("+ ");
				}
				else
				{
					System.out.print("- ");
				}
			}
			System.out.println("");
		}

		
	}
}
