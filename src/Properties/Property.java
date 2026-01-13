package Properties;

public abstract class Property 
{
 
    protected int rooms;
    protected int cubic_Meter; //Cubic meters of the property
    protected int bathrooms;
    protected int kitchens; 
    protected int garden_Cubic_Meter; 
    protected int price; 
    protected String color; //Outer building color
    protected String SSN; //Social Security Number
    protected String street_Number;
    private int properties_Sold = 0; //Counts the amount of properties sold


    public Property(int rooms, int cubic_Meter, int bathrooms, int kitchens, 
        int garden_Cubic_Meter, int price, String color, String SSN, String street_Number)
    {
        this.rooms  = Limit_Verify(rooms, 2, 7, "Room");
        this.cubic_Meter = Limit_Verify(cubic_Meter, 150, 250, "Interior cubic Meter");
        this.bathrooms = Limit_Verify(bathrooms, 1, 4, "Bathroom");
        this.kitchens = Limit_Verify(kitchens, 1, 2, "Kitchen");
        this.garden_Cubic_Meter = Limit_Verify(garden_Cubic_Meter, 100, 400, "Exterior cubic meter");
        this.price = Limit_Verify(price, 2000000, 15000000, "Price");
        this.color =  String_Verify(color);
        this.SSN = String_Verify(SSN);
        this.street_Number = String_Verify(street_Number);
        properties_Sold++;

    }


/*Gets a parameter and checks if the int values are within the limit, 
if correct then proceed, if false you must input again*/
    private static int Limit_Verify(int value, int min, int max, String section) 
    {
        if(value<min || value>max)
            {
                throw new IllegalArgumentException(section + " must be between " + min + " or " + max);
            }
        return value;
    }

//Gets a parameter and checks if string values are filled, if correct then proceed, if false you must input again
    private static String String_Verify(String value)
    {
        if(value.isEmpty())
            {
                throw new IllegalArgumentException("Error, string is empty");
            }
        return value;
    }












    // public void Assign_House_Info(int rooms, int bathrooms, int kitchens, int cubic_Meter, int color)
    // {
        


    // }

/*
                System.out.println("Exterior color?");
                System.out.println("Cost?");
                System.out.println("Kitchens?");
                System.out.println("Exterior space? (m²)");
                System.out.println("Interior space? (m²)");
                System.out.println("Bathrooms?");
                

                System.out.println("Rooms?");
                try 
                {
                    if(rooms>=2 || rooms<=7)
                    {
                        this.rooms = rooms;
                    }
                } 
                catch (IllegalArgumentException e) 
                {
                    System.out.println("Rooms must stay within 2-7.");
                }
*/
}
