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
                            register_Purchase_Option(userInputStr);
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



    public static String register_Purchase_Option(Scanner userInputStr)
    {

        System.out.println(
            "1. Villa" + 
            "\n2. Townhouse" + 
            "\n3. Garage" + 
            "\n4. Apartment"
        );
        String reg_Choice = userInputStr.nextLine();

        switch (reg_Choice) {
            case 1:
                villa(userInputStr);
                    
                };)
                break;
        
            default:
                break;
        }
            
    }



    public static String villa(Scanner userInputStr)
    {
        try 
        {            
            boolean driveway;
            System.out.println("Driveway? (y/n)");
            String choice = userInputStr.nextLine();
            if(choice.toLowerCase() == "y")
            {
                driveway = true;
            }
            else if(choice.toLowerCase() == "n")
            {
                driveway = false;
            }
                
            boolean garage;
            System.out.println("Garage? (y/n)");
            choice = userInputStr.nextLine();
            if(choice.toLowerCase() == "y")
                {
                    driveway = true;
                }
                else if(choice.toLowerCase() == "n")
                {
                    driveway = false;
                }               
                                
                                
                return new Villa(driveway, garage, 0, 0, 0, 0, 0, 0, choice, choice, choice)
                
                } catch (Exception e) {
                    throw new IllegalArgumentException("Faulty input, try again");
                }
    }





    public static String property_Common(Scanner userInputStr)
    {
        try 
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


            return (rooms, cubic_Meters, bathrooms, kitchens, garden_Cubic_Meter, price, color, SSN, street_Number);
            
            
        } catch (Exception e) {
            throw new IllegalArgumentException("Faulty input, try again");
        }
    }
}
