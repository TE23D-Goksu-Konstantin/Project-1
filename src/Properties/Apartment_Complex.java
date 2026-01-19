package Properties;
import java.util.ArrayList;

public class Apartment_Complex
{
    private int floors;
    private String street_Number;
    private ArrayList<Apartments> apartments;
    
    public Apartment_Complex(int floors, String street_Number)
    {
        this.floors = floors;
        this.street_Number = street_Number;
        this.apartments = new ArrayList<>();
    }
}