package Properties;

public class Villa extends Property
{
    private boolean driveway;
    private boolean garage;

    //Constructor, inherits superclass' variables 
    public Villa(boolean driveway, boolean garage, int rooms, int cubic_Meter, int bathrooms, int kitchens, 
        int garden_Cubic_Meter, int price, String color, String SSN, String street_Number)
    {
        super(rooms, cubic_Meter, bathrooms, kitchens, 
            garden_Cubic_Meter, price, color, SSN, street_Number);
        this.driveway = driveway;
        this.garage = garage;
    }
    

    @Override
    public String toString()
    {
        return super.toString() + 
        "\nDriveway space: " + driveway +
        "\nGarage: " + garage + 
        "\n----------------";
    }
}
