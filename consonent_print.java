//program to print consants in word 
import java.util.Scanner;
class consonent_print
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s=sc.nextLine();//to take sentence from user
        s=s+" ";//adding whitespace in string
        String z ="";
        for(int i=0;i<s.length();i++)
        {
            char ch =s.charAt(i);//loop to check whether character is a vowel
           
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
            }
            else
            {
                String g=Character.toString(ch);//explicitly converting char ch to string
                z=z+g;
            }
        }
        System.out.println(z);//printing
    }
}
  //vdt
//s.no   //function     // Use
//1      //String s     //taking string from user
//2      //String z     //a string variable to stor all consonents
//3      //int i       //to get every position of string
//4     //char ch      //every element oat position i
//5     //String g      //converting character ch to string to store in string variable
