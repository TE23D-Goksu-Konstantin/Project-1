import Properties.Property; //Import of all classes in package "Properties"
import Properties.Garage;
import Properties.Townhouse;
import Properties.Villa;
import Properties.Apartment_Complex;

import java.util.Scanner;


public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner userInputStr = new Scanner(System.in); //Keyboard reader -> string for program reader

        Property[] buildings = new Property[100]; //Amount of buildings that can exist at once
        int buildingCount = 0; //Counts all new registered buildings

        while(buildingCount <= buildings.length) //As long as building count is below max -> continue
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

}
