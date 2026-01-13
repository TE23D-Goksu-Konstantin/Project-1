package Properties;

public class Garage extends Property
{

    private boolean car_Space;
    private int storage_Space;

    public Garage(boolean car_Space, int storage_Space, int rooms, int cubic_Meter, int bathrooms, int kitchens, 
        int garden_Cubic_Meter, int price, String color, String SSN, String street_Number)
    {
        super(rooms, cubic_Meter, bathrooms, kitchens, 
            garden_Cubic_Meter, price, color, SSN, street_Number);
        this.car_Space = car_Space;
        this.storage_Space = storage_Space;
    }
    
}
