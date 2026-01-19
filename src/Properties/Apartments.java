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
        this.cubic_Meter = Utility.Limit_Verify(cubic_Meter, 25, 220, "Interior cubic meter + balcony (if included)");
        this.bathrooms = Utility.Limit_Verify(bathrooms, 1, 3, "Bathroom");
        this.price = Utility.Limit_Verify(price, 1500000, 15000000, "Price"); 
        this.balcony = balcony;
        this.SSN = Utility.String_Verify(SSN);
    }




}
