package ssignment3;

public class Pattern6 {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			
			
			for(int j=1;j<=5;j++)
			{
				
				char ch=(char)(65+(char)j);
				if(j>=6-i)
				{
					System.out.print(ch++);
					
					
					
					
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


