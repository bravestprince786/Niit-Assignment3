package ssignment3;

public class Pattern1 {

	public static void main(String[] args) {
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=5;j++)
			{
				if(j>=6-i)
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