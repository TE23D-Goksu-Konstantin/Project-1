package Properties;

public class Garage extends Property
{

    private boolean car_Space;
    private int storage_Space; //Total area of the garage

        //Constructor, inherits superclass' variables 
    public Garage(boolean car_Space, int storage_Space, int rooms, int cubic_Meter, int bathrooms, int kitchens, 
        int garden_Cubic_Meter, int price, String color, String SSN, String street_Number)
    {
        super(rooms, cubic_Meter, bathrooms, kitchens, 
            garden_Cubic_Meter, price, color, SSN, street_Number);
        this.car_Space = car_Space;
        this.storage_Space = Utility.Limit_Verify(storage_Space, 10, 50, "Garage storage area");
    }
    

    @Override
    public String toString()
    {
        return super.toString() + 
        "\nParking space: " + car_Space +
        "\nStorage space: " + storage_Space + "m^2" +
        "\n----------------";
    }
}
