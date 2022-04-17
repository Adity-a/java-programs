import java.util.Scanner;
class array {
    public static void main(String args[])
    {
        int arr[] = new int[20];
        int n;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        n = input.nextInt();

        System.out.println("Enter number: ");

        for(int i = 0; i<n; i++)
        {
        arr[i ]= input.nextInt();
        }

        System.out.println("The Array is: ");
        for(int i = 0; i<n; i++)
        {
            System.out.print(" "+arr[i]);
        }
    }
}
