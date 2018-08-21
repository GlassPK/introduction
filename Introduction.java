
/**
 * This program tells a little bit about me.
 *
 * @author Owen Bond
 * @version August 20, 2018
 */
public class Introduction
{
    public static void main(String[] args)
    {
        System.out.println("I was born in Connecticut.");
        System.out.println("I work at Big Air.");
        System.out.println("I like to do flips.");
        
        
        String name = "Owen";
        int birthYear = 2001;
        int currentYear = 2018;
        
        System.out.println("currentYear - birthYear");
        System.out.println(currentYear - birthYear);
        
        int age = currentYear - birthYear;
        
        System.out.println("My name is " + name + ", and I am "+ age +" years old.");
        
        boolean hadBirthday = true;
        
        if(hadBirthday == false){
            age -= 1;
        }
        
        System.out.println("My name is " + name + ", and I am "+ age +" years old.");
        
    }
    
        
}
    
        
