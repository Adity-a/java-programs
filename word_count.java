import java.util.Scanner;
public class word_count {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str;
        int count = 1;

        System.out.println("Enter a String: ");
        str = sc.nextLine();

        for(int i = 0; i<str.length(); i++)
        {
            if((str.charAt(i)==' ') && (str.charAt(i+1)!=' '))
            {
                count++;
            }
        }

        System.out.println("Number of words in string "+str+" is: "+count);

    }
}
