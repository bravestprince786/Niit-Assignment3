package ssignment3;

public class Pattern4 {
	public static void main(String args[])
	{
		int c=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j<=i)
				{
					System.out.print(c+" ");
					c++;
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
