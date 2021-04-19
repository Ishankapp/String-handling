import java.util.Scanner;
class cons
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s=sc.nextLine();
        s=s+" ";
        String word=" ";
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                word+=ch;
            }
            else
            {
                for(int j=1;j<word.length();j++)
                {
                    char c=word.charAt(j);
                    char cj=word.charAt(j-1);
                    if(c==cj)
                    {
                        count++;
                    }
                }
                word=" ";
            }
        }
        if(count>0)
        {
        System.out.println("The number of repititions are "+count);
        }
        else
        {
            System.out.println("No repitations found");
        }
  }
}

                        
                        
                    
            
            
        