package Properties;

public abstract class Property 
{
 
    private int rooms;
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
        setRooms_Nr(rooms);
        this.cubic_Meter = cubic_Meter;
        this.bathrooms = bathrooms;
        this.kitchens = kitchens;
        this.garden_Cubic_Meter = garden_Cubic_Meter;
        this.price = price;
        this.color =  color;
        this.SSN = SSN;
        this.street_Number = street_Number;
        properties_Sold++;

    }

    public int getRooms_Nr() //Retrieves the information of rooms set by the user
    {
        return this.rooms;
    }

    public void setRooms_Nr(int rooms) //Checks if the amount of rooms exceeds or undermines the limit
    {
        if(rooms<2 || rooms>7)
        {
            throw new IllegalArgumentException("Room amount has exceeded the limit (2-7)");
        }
        this.rooms = rooms;
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
