import java.util.Scanner;
public class armstrong {
    public static void main(String args[])
    {
        int n,temp,r,sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        n = sc.nextInt();
        temp = n;

        while(n>0)
        {
            r = n % 10;
            sum = sum + (r*r*r);
            n = n / 10;
        }

        if(sum == temp)
        {
            System.out.println("The given number "+temp+" is an armstrong number.");
        }
        else
        {
            System.out.println("The given number "+temp+" is not an armstrong number.");
        }
    }
}
