import java.util.Scanner;

public abstract class Public_Utility 
{
    public static int Int_Verifier(String name, Scanner userInputStr) 
    {
            System.out.println(name + "? ");
            String value = userInputStr.nextLine();
            int valueInt = Integer.parseInt(value);
        return valueInt;
    }



    public static String Str_Verifier(String name, Scanner userInputStr) 
    {
        System.out.println(name + "? ");
        String value = userInputStr.nextLine();
        return value;
    }
}
