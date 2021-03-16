import java.util.Scanner;

class Array
{
	public static void main (String arg[ ])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter no of row and column");
		int row=sobj.nextInt();
		int col=sobj.nextInt();
		 int arr[][]=new int [row][col];
		int brr[][]=new int[2][ ];
		brr[0]=new int[row];
		brr[1]=new int[col];
		
		for (int i=0;i<row;i++)
		{
			for (int j=0;j<col;j++)
  			{
				System.out.println("Enter ");
				arr[i][j]=sobj.nextInt();
			}
		}
		System.out.println("\n");
		System.out.println("Transpose");
		for (int i=0;i<col;i++)
		{
			for (int j=0;j<row;j++)
  			{
				System.out.print(arr[j][i]+" ");
			}
			System.out.println("\n");	
		}
	}
}
