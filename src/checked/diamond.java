package checked;

public class diamond
{
	int space=3;
	int star=1;
	{
		for(int i=1;i<=4;i++)
		{
			for(int l=1;l<=space;l++)
			{
				System.out.println(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.println("*");
			}
			System.out.println();
			space--;
			star=star+2;
		}
		int space1=1;
		int star=5;
		{
			for(int i=1;i<=4;i++)
			{
				for(int j=1;j<=space;j++)
				{
					System.out.println(" ");
				}
					for(int k=1;k<=star;k++)
					{
						System.out.println("*");
					}
					System.out.println();
					space1++;
					star2=star1-2;
			}
		}
	}
}