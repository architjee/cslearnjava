public class RandomWalkers{
	public static void main(String[] args)
	{
		int x = 0;
		int y = 0;
		int r = Integer.parseInt(args[0]);
		int trials = Integer.parseInt(args[1]);
		int steps = 0;
		for(int i=0; i<trials; i++)
		{
			x = 0;
			y = 0;	
			while(Math.abs(x)+Math.abs(y)!=r)
			{
				if(Math.random()<0.5)
				{
					if(Math.random()>0.5)
						x+=1;
					else
						x-=1;
				}
				else
				{
					if(Math.random()>0.5)
						y+=1;
					else
						y-=1;
				}
				steps+=1;
				
			}
		}
		double averageSteps = (double) steps/trials;
		System.out.println("average number of steps = "+averageSteps);
		
	}
}
