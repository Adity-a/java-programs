import java.util.Scanner;
public class matrix {
    public static void main(String args[])
    {
        int arr[][] = new int[20][20];
        int m,n,i,j;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        n = input.nextInt();
        System.out.println("Enter number of column: ");
        m = input.nextInt();

        System.out.println("Enter array elements ");
        for(i = 0; i<n; i++)
        {
            for(j = 0; j<m; j++)
            {
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("The matrix is: ");
        for(i = 0;i<n; i++)
        {
            for(j = 0; j<m; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
   }
}
