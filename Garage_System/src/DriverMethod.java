import java.util.Scanner;

public class DriverMethod implements Method  {
	public void  performMethod() {
		System.out.println(" Welecome.. driver ");  
	System.out.println("choose:\n 1.ParkIn\n  2.ParkOut\n");

		Scanner obj1= new Scanner (System.in);
		int choice = obj1.nextInt();
		switch(choice) {
		  case 1:{// park in 
			  if(!Garage.searchAvaliableSlots())
			  {
				  System.out.println("there is no avaliable slots now " );
				  System.exit(0);
			  }
			  
			  System.out.println("Enter the ID of Your Vechile\n");
			  int idVechile = obj1.nextInt();
		  
			  System.out.println("Enter the Lenght and Depth of Your Vechile\n");
			
				  
			  double len = obj1.nextDouble();
			  double depth = obj1.nextDouble();
			  while(len<=0 || depth<=0)
			  {
	          System.out.println("invalid Intput Lenght or Depth can not take value 0 or Nagtavie");
	           len = obj1.nextDouble();
			  depth = obj1.nextDouble();
	          
			  }
			  
		  
			  System.out.println("Enter the Model of Your Vechile\n");
			  Scanner obj2= new Scanner (System.in);
			  String model =obj2.nextLine(); 
			 
			  Vechile vechile = new Vechile(model ,depth , len ,idVechile);
			  
		       Garage.setPark(1, vechile);
			  
		      
		       break; 
		  }
		  
		  case 2:{//park out
			  
			  System.out.println("Enter Your Vechile ID: \n");
			  int ID = obj1.nextInt();
			  
			  Vechile vec = new Vechile();
			  
					  if(Garage.checkById(ID)!=null)
					  {
						  vec=Garage.checkById(ID); 
						  Garage.setPark(2, vec);
					  }
					  else {System.out.println("there is not vehicle with this id \n");}
					  break;
		  		}
		 
		  default:
			  System.out.println("Error You can Choose 1 or only \n");
		    
		}
	}
		
	}


