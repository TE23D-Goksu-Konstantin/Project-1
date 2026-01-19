package Properties;
import java.util.ArrayList;

public class Apartment_Complex
{
    private int floors;
    private String street_Number;
    private int cubic_Meter; //Cubic meters of the property
    private int bathrooms;
    private int price; 
    private boolean balcony;
    private String SSN;
    private ArrayList<Apartments> apartments;
    
    public Apartment_Complex(int floors, String street_Number, int cubic_Meter, 
        int bathrooms, int price, boolean balcony, String SSN)
    {
        this.floors = floors;
        this.street_Number = street_Number;
        this.apartments = new ArrayList<>();
    }
}