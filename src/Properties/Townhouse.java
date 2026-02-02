package Properties;

public class Townhouse extends Property
{
    private int conjoined_Buildings; //How many buildings it sits adjacent to (1-2)

    //Constructor, inherits superclass' variables 
    public Townhouse(int conjoined_Buildings, int rooms, int cubic_Meter, int bathrooms, int kitchens, 
        int garden_Cubic_Meter, int price, String color, String SSN, String street_Number)
    {
        super(rooms, cubic_Meter, bathrooms, kitchens, 
            garden_Cubic_Meter, price, color, SSN, street_Number);
        this.conjoined_Buildings = Utility.Limit_Verify(conjoined_Buildings, 0, 2, "Adjacent connected buildings");
    }


    @Override
    public String toString()
    {
        return super.toString() + 
        "\nConjoined buildings: " + conjoined_Buildings +
        "\n----------------";
    }
    
}
