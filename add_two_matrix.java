package Array_Q_Assignment;

public class add_two_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]= {{7,9,2,},{5,8,3},{9,6,2}};
		int b[][]= {{2,6,9},{3,1,5},{6,7,3}};
		
		int c[][]=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+"    ");

			}
			System.out.println();

		}	
}
}