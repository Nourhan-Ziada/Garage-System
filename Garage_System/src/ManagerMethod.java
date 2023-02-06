import java.util.Scanner;

public class ManagerMethod implements Method {
	public void  performMethod() {
		System.out.println(" Welecome.. manger ");  
		System.out.println("choose:\n 1.SetUP \n 2.Display Avialable Slots\n 3.Show total income \n 4.Show total number of vehicle\n");

		Scanner obj1= new Scanner (System.in);
		int choice = obj1.nextInt();
		switch(choice) {
		  case 1:
		  {
			System.out.println("Enter The Number  of Slots ");
			int slots = obj1.nextInt();
			System.out.println("Choose Configration: \n  1. First come first served slots the park-in \n "+ " 2.Best-fit approach \n" );
					
			int config  = obj1.nextInt();
			while (config != 1 && config != 2)
			{
				System.out.println("Enter valid number for Configration 1 or 2 only");
				obj1= new Scanner (System.in);
				config  = obj1.nextInt();
			}
			
			Garage.SetUp(slots, config);
			  break; }
		  
		   
		  case 2:
		  { 
			  Garage.displayAvaliableSlots();
		    break;
		   }
		  case 3:
		  { 
			  System.out.println("The Total income is = "+ Finance.getTotalIncome());
		    break;
		    }
		  case 4:
		  { 
			  System.out.println("The number of vehicle is = "+ Garage.getNumOfVehicle());
		    break;
		    }
		  
		  default:
				System.out.println("Error You can Choose 1 or 2 or 3 or 4 only \n");

		}
		
	}
}
