package ssignment3;

public class Pattern5 {

	public static void main(String[] args) {
		
		char ch;
			for(int i=1;i<=5;i++)
			{
				ch=65;
				for(int j=1;j<=5;j++)
				{
					if(j<=i)
					{
						System.out.print(ch+" ");
						ch++;
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
