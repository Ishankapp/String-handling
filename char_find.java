import java.util.Scanner;
class char_find
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int count=0;
        System.out.println("Enter a sentence");
        String s = sc.nextLine();
        s=s+" ";
        System.out.println("Enter a character which needs to be searched");
        String str=sc.next();
        char ch=str.charAt(0);
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c==ch)
            {
                count++;
            }
            else
            {
            }
        }
        if(count==0)
        {
            System.out.println("Character not found");
        }
        else
        {
            System.out.println(count);
        }
    }
}