import java.util.Scanner;
class firstletter
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        str=str+" ";
        String word=" ";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch!=' ')
            {
                word=word+ch;
            }
            else
            {
                char cj=word.charAt(1);
                System.out.println(cj);
                word=" ";
            }
        }
    }
}        