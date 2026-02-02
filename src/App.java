import Properties.Property; //Import of all classes in package "Properties"
import Properties.Garage;
import Properties.Townhouse;
import Properties.Villa;
import Properties.Apartment_Complex;
import Properties.Apartments;
import Properties.Shared;

import java.util.ArrayList;
import java.util.Scanner;


public class App 
{
    public static void main(String[] args) throws Exception 
    {
        ArrayList<Shared> buildings = new ArrayList<>(); //Creates the shared arraylist dependant on the interface

        Scanner userInputStr = new Scanner(System.in); //Keyboard reader -> string for program reader
        
        int buildingCount = 0; //Counts all new registered buildings

        while(buildingCount <= buildings.size()) //As long as building count is below max -> continue
        {
            System.out.println(
                "1. Register purchase" + 
                "\n2. Unregister purchase" + 
                "\n3. List orders" + 
                "\n4. Count profit"
                );
                
            String menu_Choice = userInputStr.nextLine(); //Forces a user input
            try 
            {
                int userInputInt = Integer.parseInt(menu_Choice); //Translates user input to an integer
                switch (userInputInt) {
                    case 1:
                        System.out.println("Register purchase selected");
                        register_Purchase_Option(userInputStr, buildings);
                        buildingCount++;
                        break;
    
                    case 2:
                        System.out.println("Unregister purchase selected");
                        RemoveOrder(buildings, userInputStr);
                        buildingCount--;
                        break;
    
                    case 3:
                        System.out.println("List orders selected");

                        if(buildings.isEmpty())
                        {
                            System.out.println("No orders registered yet");
                        }
                        else
                        {
                            for(Shared p : buildings)
                            {
                                System.out.println(p);
                            }
                        }

                        break;
    
                    case 4:
                        System.out.println("Count profit selected"); //Counts and adds all costs of the variable price in the list
                        int totalProfit = 0;
                        for(int i = 0; i < buildings.size(); i++)
                        {
                            totalProfit += buildings.get(i).getPrice();
                        }
                        System.out.println("Profit: " + totalProfit);

                        break;
                        

                        default:
                            System.out.println("Please choose an option to proceed");
                            break;
                    }
                } 
                catch (IllegalArgumentException e) //If input is invalid -> throw error msg
                {
                    System.out.println("Please choose an option to proceed");
                }

            }

    }


    //registers the input and proceeds to add it to the registry if input values are correct
    public static void register_Purchase_Option(Scanner userInputStr, ArrayList<Shared> buildings) 
    {

        System.out.println(
            "1. Villa" + 
            "\n2. Townhouse" + 
            "\n3. Garage" + 
            "\n4. Apartment"
        );
        int reg_Choice = userInputStr.nextInt();

        switch (reg_Choice) { //checks user input and directs accordingly
            case 1:
                buildings.add(villa_Create(userInputStr)); 
                break;

            case 2:
                buildings.add(townhouse_Create(userInputStr)); 
                break;  

            case 3:
                buildings.add(garage_Create(userInputStr)); 
                break;  

            case 4:
             Apartment_Complex complex = createApartmentComplex(userInputStr); //Creates a new complex and adds the amount of apartments to the complex
                addApartmentsToComplex(complex, userInputStr);
                buildings.add(complex);
                break;
                
            default:
                break;
        }  
    }

    //Creates the apartment complex (parent to individual apartments)
    public static Apartment_Complex createApartmentComplex(Scanner userInputStr) 
    {
        userInputStr.nextLine(); //Important to clear previous line

        int floors = Public_Utility.Int_Verifier("Number of floors", userInputStr);
        String street = Public_Utility.Str_Verifier("Street name", userInputStr);
        String SSN = Public_Utility.Str_Verifier("Owner SSN", userInputStr);
        int price = Public_Utility.Int_Verifier("Price of the complex", userInputStr);

        return new Apartment_Complex(floors, street, SSN, price);
    }



    
    //Creates the individual apartments
    public static Apartments apartment_Create(Scanner userInputStr)
    {
        try 
        {
            userInputStr.nextLine(); //Super important for no first misreads 
            int cubic_Meters = Public_Utility.Int_Verifier("Cubic meters", userInputStr);
            int bathrooms = Public_Utility.Int_Verifier("Bathrooms", userInputStr);
            int price = Public_Utility.Int_Verifier("Price", userInputStr);
            boolean balcony = Public_Utility.bool_Verifier("Balcony", userInputStr);
            String SSN = Public_Utility.Str_Verifier("SSN", userInputStr);
    
            return new Apartments(cubic_Meters, bathrooms, price, balcony, SSN);
            
        } 
        catch (Exception e) 
        {
            throw new IllegalArgumentException("Faulty input, try again");
        }
    }

    //Creates the individual apartments according to the amount of apartments listed in complex
    public static void addApartmentsToComplex(Apartment_Complex complex, Scanner userInputStr) 
    {
        int numApartments = Public_Utility.Int_Verifier("Number of apartments", userInputStr);

        for (int i = 0; i < numApartments; i++) 
        {
            Apartments a = apartment_Create(userInputStr);
            complex.addApartment(a);
        }
    }


    
    public static Villa villa_Create(Scanner userInputStr)
    {
        try 
        {           
            userInputStr.nextLine(); //Super important for no first misreads 
            boolean garage = Public_Utility.bool_Verifier("Garage", userInputStr);
            boolean driveway = Public_Utility.bool_Verifier("Driveway", userInputStr);

            PropertyTemp temp = Property_Create(userInputStr);
            
            return new Villa(driveway, garage, temp.rooms, temp.cubic_Meters, temp.bathrooms, temp.kitchens, 
                temp.garden_Cubic_Meter, temp.price, temp.color, temp.SSN, temp.street_Number);
            
            
        } catch (Exception e) {
            throw new IllegalArgumentException("Faulty input, try again");
        }
    }


    public static Townhouse townhouse_Create(Scanner userInputStr)
    {
        try 
        {           
            userInputStr.nextLine(); //Super important for no first misreads 
            int conjoined_Buildings = Public_Utility.Int_Verifier("Conjoined buildings", userInputStr);

            PropertyTemp temp = Property_Create(userInputStr);
            
            return new Townhouse(conjoined_Buildings, temp.rooms, temp.cubic_Meters, temp.bathrooms, temp.kitchens, 
                temp.garden_Cubic_Meter, temp.price, temp.color, temp.SSN, temp.street_Number);
            
            
        } catch (Exception e) {
            throw new IllegalArgumentException("Faulty input, try again");
        }
    }


    public static Garage garage_Create(Scanner userInputStr)
    {
        try 
        {           
            userInputStr.nextLine(); //Super important for no first misreads 
            int storage_Space = Public_Utility.Int_Verifier("Storage space", userInputStr);
            boolean car_Space = Public_Utility.bool_Verifier("Car availability", userInputStr);

            PropertyTemp temp = Property_Create(userInputStr);
            
            return new Garage(car_Space, storage_Space, temp.rooms, temp.cubic_Meters, temp.bathrooms, temp.kitchens, 
                temp.garden_Cubic_Meter, temp.price, temp.color, temp.SSN, temp.street_Number);
            
            
        } catch (Exception e) {
            throw new IllegalArgumentException("Faulty input, try again");
        }
    }



    //Shared for all properties, simplifies the sharing information
    public static PropertyTemp Property_Create(Scanner userInputStr)
    {

        int rooms = Public_Utility.Int_Verifier("Rooms (2-7)", userInputStr);

        int cubic_Meters = Public_Utility.Int_Verifier("Cubic meters (150-250)", userInputStr);

        int bathrooms = Public_Utility.Int_Verifier("Bathrooms (0-4)", userInputStr);

        int kitchens = Public_Utility.Int_Verifier("Kitchens (0-2)", userInputStr);

        int garden_Cubic_Meter = Public_Utility.Int_Verifier("Garden cubic meters (0-400)", userInputStr);

        int price = Public_Utility.Int_Verifier("Price (500,000-1,500,000)", userInputStr);

        String color = Public_Utility.Str_Verifier("Exterior color", userInputStr);

        String SSN = Public_Utility.Str_Verifier("Social security number", userInputStr);
            
        String street_Number = Public_Utility.Str_Verifier("Street name", userInputStr);


        return new PropertyTemp(rooms, cubic_Meters, bathrooms, kitchens, garden_Cubic_Meter, price, color, SSN, street_Number);

    }




    //Removes and order dependant on the buildings owner's social security number (SSN)
    public static void RemoveOrder(ArrayList<Shared> buildings, Scanner userInputStr)
    {
        if(buildings.isEmpty())
        {
            System.out.println("No orders registered yet");
            return;
        }
        
        System.out.println("Enter SSN: ");
        String SSN = userInputStr.nextLine();

        for(int i = 0; i < buildings.size(); i++)
            {
                if(buildings.get(i).getSSN().equals(SSN))
                    {
                        buildings.remove(i);
                        System.out.println("Order successfully removed");
                        return;
                    }
            }
    }
}
