import java.util.Scanner;
class palindrome{
    public static void main(String args[])
    {
        int n,r,sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        n = sc.nextInt();
        int temp = n;

        while(n>0)
        {
            r = n % 10;
            sum = sum * 10 + r;
            n = n / 10;
        }
        if(sum == temp)
        System.out.println("The given number "+temp+" is a palindrome number.");

        else
        System.out.println("The given number "+temp+" is not a palindrome number.");
    }
}