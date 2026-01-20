import Properties.Property;
import Properties.Garage;
import Properties.Townhouse;
import Properties.Villa;
import Properties.Apartment_Complex;

import java.util.Scanner;


public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner userInputStr = new Scanner(System.in);

        Property[] buildings = new Property[100];
        int buildingCount = 0;

        while(buildingCount <= buildings.length)
            {
                String menu_Choice = userInputStr.nextLine();
                int userInputInt = Integer.parseInt(menu_Choice);
                System.out.println(
                    "1. Register purchase" + 
                    "\n2. Unregister purchase" + 
                    "\n3. List orders" + 
                    "\n4. Count profit"
                );


            }

    }
}
