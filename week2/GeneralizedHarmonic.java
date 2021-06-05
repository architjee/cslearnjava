public class GeneralizedHarmonic{
	public static void main(String[] args)
	{
		int n = Integer.parseInt(args[0]);
		int r = Integer.parseInt(args[1]);
		double suma = 0.0;
		for(int i=1; i<=n; i++)
		{
			double rem = 1.0;
			for(int j=0; j<r; j++)
			{
				rem = rem/i;
			}
			suma = suma + rem;
		}
		System.out.println(suma);
	}
}
