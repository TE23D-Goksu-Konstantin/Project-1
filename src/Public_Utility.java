import java.util.Scanner;


public abstract class Public_Utility 
{
    public static int Int_Verifier(String name, Scanner userInputStr) 
    {
        while(true)
        {
            try 
            {
                System.out.println(name + "? ");
                String value = userInputStr.nextLine();
                int valueInt = Integer.parseInt(value);
                return valueInt;
                
            } catch (Exception e) {
                System.out.println("Faulty input, try again");
            }
        }
    }



    public static String Str_Verifier(String name, Scanner userInputStr) 
    {
        try 
        {
            
        System.out.println(name + "? ");
        String value = userInputStr.nextLine();

        return value;
                } catch (Exception e) {
            throw new IllegalArgumentException("Faulty input, try again");
        }
    }


    public static boolean bool_Verifier(String name, Scanner userInputStr)
    {
        while(true)
            {
                System.out.println(name + "? (y/n)");
                String choice = userInputStr.nextLine();
                if(choice.equalsIgnoreCase("y"))
                {
                    return true;
                }
                else if(choice.equalsIgnoreCase("n"))
                {
                    return false;
                }
                else
                {
                    System.out.println("Faulty input, try again");
                }
            }
    }
}
