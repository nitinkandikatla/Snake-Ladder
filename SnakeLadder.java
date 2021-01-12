class SnakeLadder
{
	public static void main(String args[])
	{
		int position=0,dicePlayed=0,position1=0;
		while(position!=100)
		{
			int dieRoll=1+(int)Math.floor(Math.random()*10)%6;
			dicePlayed++;
			System.out.println("Die Rolled:"+dieRoll);
			int optionSelect=1+(int)Math.floor(Math.random()*10)%6;
			if(optionSelect==1)
			{
				System.out.println("**No Play**");
			}
			else if(optionSelect==2)
			{
				System.out.println("$$$$$Hurrah Ladder Comes$$$$");
				if(position+dieRoll<=100)
				{
					position+=dieRoll;
					System.out.println("Position of player:" +position);
				}
				else if(position+dieRoll>100)
				{
					continue;
				}

			}
			else
			{
				System.out.println("####Opps Snake Comes####");
				if((position-dieRoll)<0)
				{
					position=0;
				}
				else
				{
					position-=dieRoll;
					System.out.println("Position of player:" +position);
				}
			}
			
			
		}
		System.out.println("Number of times dice rolled to win:" +dicePlayed);
	}

}
