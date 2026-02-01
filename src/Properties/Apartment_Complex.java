package Properties;
import java.util.ArrayList;

public class Apartment_Complex implements Shared
{
    private int floors;
    private String street_Number;
    private ArrayList<Apartments> apartments;
    private String SSN;
    private int price;


    //Constructor for a new apartment complex building which can hold multiple apartments
    public Apartment_Complex(int floors, String street_Number, String SSN, int price)
    {
        this.floors = Utility.Limit_Verify(floors, 3, 20, "Apartment floors");
        this.street_Number = Utility.String_Verify(street_Number);
        this.apartments = new ArrayList<>();
        this.SSN = Utility.String_Verify(SSN);
        this.price = Utility.Limit_Verify(price, 5000000, 100000000, "Apartment complex price");
    }

    //Due to there possibly being multiple apartments it needs to repeat printing untill all are out
    @Override
    public String toString() 
    {
        StringBuilder sb = new StringBuilder();
        sb.append("--Apartment Complex--")
        .append("\nFloors: ").append(floors)
        .append("\nAddress: ").append(street_Number)
        .append("\nSSN: ").append(SSN)
        .append("\nPrice: ").append(price)
        .append("\nApartments:");

        for (Apartments a : apartments) {
            sb.append("\n").append(a.toString());
        }

        return sb.toString();
    }


    public void addApartment(Apartments a)
    {
        apartments.add(a);
    }


    //retrievs shared information
    @Override
    public String getSSN()
    {
        return SSN;
    }

    @Override 
    public int getPrice()
    {
        return price;
    }
}