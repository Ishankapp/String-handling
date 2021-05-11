//program to convert word to piglatin
import java.util.Scanner;
public class PiglatinWord
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the word to be converted.");
        String word=ob.next();//taking string as input
        word=word.toUpperCase();//converting word to uppercase
        String piglatin="";
        int flag=0;
        for(int i=0;i<word.length();i++)//checking if word has vowels at start and adding AY
        {
            char x=word.charAt(i);
            if(x=='A' || x=='E' || x=='I' || x=='O' ||x=='U')
            {
                piglatin=word.substring(i)+word.substring(0,i)+"AY";
                flag++;
                break;
            }
        }
        if(flag==0)
        {
            piglatin=word+"AY";
        }
        System.out.println(word+" in Piglatin format is "+piglatin);
    }
}
  //vdt
//s.no   //variable     // Use
//1      //String word  //taking input from user
//2      //String pigltin //using string to store words in piglatin format
//3      //int flag      //to check whether word has vowels
//4      ///char i       //to get positon of character in string
//5     //char x        //to get character at position i