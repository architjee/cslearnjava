public class RandomWalker{
	public static void main(String[] args)
	{
		int x = 0;
		int y = 0;
		int r = Integer.parseInt(args[0]);
		int steps = 0;
		System.out.println("("+x+", "+y+")");
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
			System.out.println("("+x+", "+y+")");
		}
		System.out.println("steps = "+steps);
	}
}
