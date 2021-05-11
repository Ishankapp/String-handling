import java.util.Scanner;
class frequency_char
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("Enter character");
        String ce=sc.next();
        char c=ce.charAt(0);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        str=str+" ";
        String word=" ";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch!=' ')
            {
                word+=ch;   
            }
            else
            {
                for(int j=0;j<word.length();j++)
                { 
                char cj=str.charAt(j);
                if(cj==c)
                {
                    count++;
                }
                }
            }
        }
        System.out.println("the number of repititions are "+ count);
    }
}
            