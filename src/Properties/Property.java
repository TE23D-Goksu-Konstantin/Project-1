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
    public int properties_Sold = 0; //Counts the amount of properties sold

    //Constructor, assigns the values written by the user into the program
    public Property(int rooms, int cubic_Meter, int bathrooms, int kitchens, 
        int garden_Cubic_Meter, int price, String color, String SSN, String street_Number)
    {
        this.rooms  = Utility.Limit_Verify(rooms, 2, 7, "Room");
        this.cubic_Meter = Utility.Limit_Verify(cubic_Meter, 150, 250, "Interior cubic meter");
        this.bathrooms = Utility.Limit_Verify(bathrooms, 0, 4, "Bathroom");
        this.kitchens = Utility.Limit_Verify(kitchens, 0, 2, "Kitchen");
        this.garden_Cubic_Meter = Utility.Limit_Verify(garden_Cubic_Meter, 0, 400, "Exterior cubic meter");
        this.price = Utility.Limit_Verify(price, 500000, 15000000, "Price");
        this.color =  Utility.String_Verify(color);
        this.SSN = Utility.String_Verify(SSN);
        this.street_Number = Utility.String_Verify(street_Number);
        properties_Sold++;

    }



    @Override
    public String toString()
    {
        return 
        "\nAdress: " + street_Number +
        "\nPrice: " + price + 
        "\nBuyers SSN: " + SSN +  
        "\n----------------" + 
        "\nRooms: " + rooms + 
        "\nArea: " + cubic_Meter + "m^2" + 
        "\nGarden area: " + garden_Cubic_Meter + "m^2" + 
        "\nBathrooms: " + bathrooms + 
        "\nKitchens: " + kitchens + 
        "\nOuter color: " + color;
    }


    public String getSSN()
    {
        return SSN;
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
