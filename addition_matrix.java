import java.util.Scanner;
class addition_matrix{
    public static void main(String args[])
    {
        int n,m,i,j;

        int arr1[][] = new int[20][20];
        int arr2[][] = new int[20][20];
        int arr3[][] = new int[20][20];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        n = sc.nextInt();

        System.out.println("Enter number of column:");
        m = sc.nextInt();

        System.out.println("Enter number of Elements for array 1:");
        for(i = 0; i<n; i++)
        {
            for(j = 0; j<m; j++)
            {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter number of elements for array 2:");
        for(i = 0; i<n; i++)
        {
            for(j = 0; j<m; j++)
            {
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println("The addition matrix is: ");
        for(i = 0; i<n; i++)
        {
            for(j = 0; j<m; j++)
            {
                arr3[i][j] = arr1[i][j]+arr2[i][j];
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
    }
}