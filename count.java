import java.util.Scanner;

public class count {
    public static void main(String args[])
    {
        String str;
        int count = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter string: ");
        str = input.nextLine();

        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' ')
            count++;
        }

        System.out.println("total number of character in string " +str+" is: "+count);

    }
}
