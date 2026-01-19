package Properties;

public abstract class Utility 
{

/*Gets a parameter and checks if the int values are within the limit, 
if correct then proceed, if false you must input again*/
    public static int Limit_Verify(int value, int min, int max, String section) 
    {
        if(value<min || value>max)
            {
                throw new IllegalArgumentException(section + " must be between " + min + " or " + max);
            }
        return value;
    }

//Gets a parameter and checks if string values are filled, if correct then proceed, if false you must input again
    public static String String_Verify(String value)
    {
        if(value.isEmpty())
            {
                throw new IllegalArgumentException("Error, string is empty");
            }
        return value;
    }
    
}
