import java.util.Scanner;
import java.util.Vector;

public class Boundry {
    private Method choosedMethod ;
    
	
	
	public void  start()
	{ 
		choosedMethod  = new ManagerMethod ();
		choosedMethod.performMethod();
		
		boolean notExit = true ;
		Scanner obj= new Scanner (System.in);
		 while( notExit ) {
		 System.out.println("choose: 1.for Manager\n2.for Driver\n3.Exit\n");
			int choice = obj.nextInt();
			switch(choice) {
			  case 1:
			  {
				  choosedMethod  = new ManagerMethod ();
				  choosedMethod.performMethod();
				  break; 
			  }
			   
			  case 2:{
				  choosedMethod  = new DriverMethod();
				  choosedMethod.performMethod();
			    break;
			  }
			  case 3 :
			  {
				  notExit = false;
				  break;
			  }
			  
			  default:
				  System.out.println("Error You can Choose 1 or 2 or 3 only \n");
			}
		 }
		 
	}
//	public void confirmSetup() {
//		
//	}

	public static  Vector<Double> takeAllDimentionSlots(int slots) {
		
		 Vector<Double> slotsInfo ;
		 slotsInfo = new Vector<Double> ();
		 double num ;
		 System.out.println("Enter The Lenght and Width of Slot ");  
		 for(int i =0  ; i< slots*2 ; i++) {
		Scanner obj= new Scanner (System.in);
		num = obj.nextDouble() ;
		while (num<=0)
		{
			System.out.println("Enter valid number for Lenght and Width of Slot that bigger than 0 ");
			obj= new Scanner (System.in);
			num = obj.nextDouble() ;
		}
		
		slotsInfo.add(num);
		 }
		
		return slotsInfo ;
		
		 
		
	}
	
	
	
	
//	public void chooseParking() {
//		
//	}
	
		
		

public static  void confirmParking(int slot ,int  id ) {
	System.out.println("\nYour Vechile ID: \n"+id );
	System.out.println("You can Park at Slot: \n"+slot );

}
public static void displayFees(long fee ) {
	System.out.println("\nYour Fees: \n"+fee);


}



}


	
	
