//to check whether string is palindrome or not
//program to check whether string is palindrome or not 
import java.util.Scanner; 
 class PalindromeString    
{    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string which needs to be checked");
        String string = sc.nextLine();
        string=string+"";
        boolean flag = true;    
            
        //Converts the given string into lowercase    
        string = string.toLowerCase();    
            
        //Iterate the string forward and backward, compare one character at a time     
        //till middle of the string is reached    
        for(int i = 0; i < string.length()/2; i++){    
            if(string.charAt(i) != string.charAt(string.length()-i-1)){    
                flag = false;    
                break;    
            }    
        }    
        if(flag)    
            System.out.println("Given string is palindrome");    
        else    
            System.out.println("Given string is not a palindrome");    
    }    
}    
  //vdt
//s.no   //variable     // Use
//1      // String string  //string which takes user input
//2      //boolean flag   //to check whether string is palindrome or not