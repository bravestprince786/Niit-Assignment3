package ssignment3;

public class Pattern2 {
	public static void main(String args[])
	{
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=7;j++)
			{
				if(j>=5-i && j<=3+i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");	
				}
			}
			System.out.println();
		}
	}

}
