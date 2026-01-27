import Properties.Property; //Import of all classes in package "Properties"
import Properties.Garage;
import Properties.Townhouse;
import Properties.Villa;
import Properties.Apartment_Complex;

import java.util.ArrayList;
import java.util.Scanner;


public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner userInputStr = new Scanner(System.in); //Keyboard reader -> string for program reader
        
        ArrayList<Property> buildings = new ArrayList<>(); //Amount of buildings that can exist at once
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
                            break;
    
                        case 2:
                            System.out.println("Unregister purchase selected");
    
                            break;
    
                        case 3:
                            System.out.println("List orders selected");
    
                            break;
    
                        case 4:
                            System.out.println("Count profit selected");
    
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



    public static void register_Purchase_Option(Scanner userInputStr, ArrayList<Property> buildings)
    {

        System.out.println(
            "1. Villa" + 
            "\n2. Townhouse" + 
            "\n3. Garage" + 
            "\n4. Apartment"
        );
        int reg_Choice = userInputStr.nextInt();

        switch (reg_Choice) {
            case 1:
                buildings.add(villa_Create(userInputStr)); 
                break;
                
            default:
                break;
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



    public static PropertyTemp Property_Create(Scanner userInputStr)
    {

        int rooms = Public_Utility.Int_Verifier("Rooms", userInputStr);

        int cubic_Meters = Public_Utility.Int_Verifier("Cubic meters", userInputStr);

        int bathrooms = Public_Utility.Int_Verifier("Bathrooms", userInputStr);

        int kitchens = Public_Utility.Int_Verifier("Kitchens", userInputStr);

        int garden_Cubic_Meter = Public_Utility.Int_Verifier("Garden cubic meters", userInputStr);

        int price = Public_Utility.Int_Verifier("Price", userInputStr);

        String color = Public_Utility.Str_Verifier("Exterior color", userInputStr);

        String SSN = Public_Utility.Str_Verifier("Social security number", userInputStr);
            
        String street_Number = Public_Utility.Str_Verifier("Street name", userInputStr);


        return new PropertyTemp(rooms, cubic_Meters, bathrooms, kitchens, garden_Cubic_Meter, price, color, SSN, street_Number);

    }










}
