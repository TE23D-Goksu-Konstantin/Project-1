package Properties;

public class Apartments
{
    private int cubic_Meter; //Cubic meters of the property
    private int bathrooms;
    private int price; 
    private boolean balcony;
    private String SSN;

    public Apartments(int cubic_Meter, int bathrooms, int price, boolean balcony, String SSN)
    {
        this.cubic_Meter = Limit_Verify(cubic_Meter, 25, 220, "Interior cubic meter + balcony (if included)");
        this.bathrooms = Limit_Verify(bathrooms, 1, 3, "Bathroom");
        this.price = Limit_Verify(price, 1500000, 15000000, "Price"); 
        this.balcony = balcony;
        this.SSN = String_Verify(SSN);
    }



    private static int Limit_Verify(int value, int min, int max, String section) 
    {
        if(value<min || value>max)
            {
                throw new IllegalArgumentException(section + " must be between " + min + " or " + max);
            }
        return value;
    }

    private static String String_Verify(String value)
    {
        if(value.isEmpty())
            {
                throw new IllegalArgumentException("Error, string is empty");
            }
        return value;
    }

}
