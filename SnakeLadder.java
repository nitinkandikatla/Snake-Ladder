class SnakeLadder
{
	
		public static int flag=0;
		public static int compute(int position) {
			int dieRoll=1+(int)Math.floor(Math.random()*10)%6;
			System.out.println("Die Rolled:"+dieRoll);
			int optionSelect=1+(int)Math.floor(Math.random()*10)%3;
			if(optionSelect==1)
			{
				System.out.println("**No Play**");
				if(flag==0)
				     flag=1;
				else
					flag=0;
			}
			else if(optionSelect==2)
			{
				System.out.println("$$$$$Hurrah Ladder Comes$$$$");
				if((position+dieRoll)<=100)
				{
					position+=dieRoll;
					
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
				}
				if(flag==0)
				     flag=1;
				else
					flag=0;
			}
			
			return position;
		}
		public static void main(String args[])
		{
			int player1_position=0,player2_position=0,dice1Count=0,dice2Count=0;
		 
			while(player1_position!=100 && player2_position!=100)
			{
				if(flag==0) {
					player1_position=compute(player1_position);
					dice1Count++;
					System.out.println("Position of player1: " + player1_position);
					System.out.println("dice rolled count of player 1: " + dice1Count);
				}
				else {
					player2_position=compute(player2_position);
					dice2Count++;
					System.out.println("Position of player2: " + player2_position);
					System.out.println("dice rolled count of player 2: " + dice2Count);
				}
			}
			if(player1_position==100)
			{
				System.out.println("Winner : PLAYER 1");
			}
			else
			{
				System.out.println("Winner : PLAYER 2");
			}
		}
			
}


