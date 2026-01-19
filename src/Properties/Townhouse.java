package Properties;

public class Townhouse extends Property
{
    private int conjoined_Buildings; //How many buildings it sits adjacent to (1-2)

    public Townhouse(int conjoined_Buildings, int rooms, int cubic_Meter, int bathrooms, int kitchens, 
        int garden_Cubic_Meter, int price, String color, String SSN, String street_Number)
    {
        super(rooms, cubic_Meter, bathrooms, kitchens, 
            garden_Cubic_Meter, price, color, SSN, street_Number);
        this.conjoined_Buildings = Utility.Limit_Verify(conjoined_Buildings, 0, 2, "Adjacent connected buildings");
    }
    
}
