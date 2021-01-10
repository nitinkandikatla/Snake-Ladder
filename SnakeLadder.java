class SnakeLadder
{
	public static void main(String args[])
	{
		int position=0;
		int dieRoll=1+(int)Math.floor(Math.random()*10)%6;
		System.out.println("Die Rolled:"+dieRoll);
		int optionSelect=1+(int)Math.floor(Math.random()*10)%3;
		if(optionSelect==1)
		{
			System.out.println("**No Play**");
		}
		else if(optionSelect==2)
		{
			System.out.println("$$$$$Hurrah Ladder Comes$$$$");
			position+=dieRoll;

		}
		else
		{
			System.out.println("####Opps Snake Comes####");
			position-=dieRoll;
		}
	}

}

