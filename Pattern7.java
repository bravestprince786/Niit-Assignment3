package ssignment3;

public class Pattern7 {

	public static void main(String[] args) {
		int n = 1;
		for(int i=1;i<=3;i++)
		{
			int k=1;
			for(int j=1;j<=6;j++)
			{
				if(j<=i || j>=7-i)
				{
					System.out.print(n);
					n=j<4?++k:--k;
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
