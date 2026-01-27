import Properties.Utility;

public class PropertyTemp
{
    protected int rooms;
    protected int cubic_Meters; //Cubic meters of the property
    protected int bathrooms;
    protected int kitchens; 
    protected int garden_Cubic_Meter; 
    protected int price; 
    protected String color; //Outer building color
    protected String SSN; //Social Security Number
    protected String street_Number;




        public PropertyTemp(int rooms, int cubic_Meters, int bathrooms, int kitchens, 
        int garden_Cubic_Meter, int price, String color, String SSN, String street_Number)
    {
        this.rooms  = Utility.Limit_Verify(rooms, 2, 7, "Room");
        this.cubic_Meters = Utility.Limit_Verify(cubic_Meters, 150, 250, "Interior cubic meter");
        this.bathrooms = Utility.Limit_Verify(bathrooms, 0, 4, "Bathroom");
        this.kitchens = Utility.Limit_Verify(kitchens, 0, 2, "Kitchen");
        this.garden_Cubic_Meter = Utility.Limit_Verify(garden_Cubic_Meter, 0, 400, "Exterior cubic meter");
        this.price = Utility.Limit_Verify(price, 500000, 15000000, "Price");
        this.color =  Utility.String_Verify(color);
        this.SSN = Utility.String_Verify(SSN);
        this.street_Number = Utility.String_Verify(street_Number);

    }
}