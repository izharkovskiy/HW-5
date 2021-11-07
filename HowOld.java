import java.util.Scanner;

public class HowOld
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String name;
        int age;

        System.out.println("Hello. What is your name?");
        name = keyboard.next();

        System.out.println(" ");
        System.out.println("Hi, " + name + "! How old are you?");
        age = keyboard.nextInt();
        
        if (age <= 16)
        {
          System.out.println("You can't drive, " + name + ".");
          
        }
        if (age <= 18)
        {
          System.out.println("You can't vote, " + name + ".");
          System.out.println("You can't rent a car, " + name + ".");
                  
        } else if (age <= 25)
        {
            System.out.println("You can't rent a car, " + name + ".");
            
        } else {
            System.out.println("You can do anything that's legal, " + name + ".");
        }


        
        keyboard.close();




    }
}