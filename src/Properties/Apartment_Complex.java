package Properties;
import java.util.ArrayList;

public class Apartment_Complex
{
    private int floors;
    private String street_Number;
    private ArrayList<Apartments> apartments;

    //Constructor for a new apartment complex building which can hold multiple apartments
    public Apartment_Complex(int floors, String street_Number)
    {
        this.floors = Utility.Limit_Verify(floors, 3, 20, "Apartment floors");
        this.street_Number = Utility.String_Verify(street_Number);
        try 
        {
            if(apartments.size() <= floors)
            {
                this.apartments = new ArrayList<>();
            }
        } 
        catch (IllegalArgumentException e)
        {
            System.out.println("Maximum amount of apartments for this complex has been reached");
        }
    }


    @Override
    public String toString()
    {
        return
        "\n--Apartment complex--" +
        "\nFloors: " + floors +
        "\nAdress: " + street_Number + 
        "\n--Apartment--";
    }
}