 import java.time.LocalTime; // import the LocalTime class
import java.util.Vector;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class Garage {
	public static  Configuration configuration;                     
	//private static int slots ;
	//private static int config;
	private static Vector<Slot> allSlot;
	private static Vector<Slot> avaliableSlot = new Vector<Slot> ();  
	private static Vector<Vechile> allVehicle = new Vector<Vechile> ();
	private static int numOFViecle = 0; 
	
	
//	private Garage() { // we do not call constructor any more
//		
//		 avaliableSlot = new Vector<Slot> ();
//		 allVehicle  = new Vector<Vechile> ();
//		
//	};
//	private Garage(int slots , int config) {
//		this.slots = slots;	
//		this.config = config;
//		// allSlot = new Vector<Slot> (slots) ;
//		// avaliableSlot = new Vector<Slot> ();
//		// allVehicle  = new Vector<Vechile> ();
//		
//	}///---------------

public static Vechile checkById(int vehicleId) {
		
		for (int i=0; i<allVehicle.size() ;i++)
		{
			if (allVehicle.get(i).getId()== vehicleId)
			{
				return allVehicle.get(i);
			}
		}
		return null;
		
	}
public static void deleteVehicle(Vechile vec) {
	
	allVehicle.remove(vec);
	
}
	
	public static void setPark (int parkType , Vechile vechile )
	{
		Parking parking ;
		if(parkType == 1)//maybe i do factory method pattern 
		{
			 parking = new ParkIn();		
		}
		else 
		{
			 parking = new ParkOut();
		}
		parking.park(vechile);	
	}
	
	public static void searchToSetFlag( Vechile vehicle)
	{
		
		for (int i=0; i<allSlot.size();i++)
		{
			if (allSlot.get(i).getId()==vehicle.getSlotId() )
			{
				allSlot.get(i).setFlag(false);
			}
		}
		
	}
	
	
	
	public static void SetUp(int numSlots , int configType) {
		
		
		 allSlot = new Vector<Slot> (numSlots);
		 
		  Vector <Double> slotsData= Boundry.takeAllDimentionSlots(numSlots);
		  if(configType==1)//break open close while creation
			{
			   configuration = new FirstConfiguration();
				
			}
			else if(configType==2)
			{
				 configuration = new SecondConfiguration();
				
			}
		 
		for(int i =0 , x=0  ; i<= numSlots ; i= i+2 )
		{
			
			//System.out.println(" index " + x + "lenght = " + slotsData.get(x) + "Width= " + slotsData.get(++x));
			addSlot (slotsData.get(x) , slotsData.get(++x));
			//System.out.println(" num " + x );
			x++ ;
		}
		System.out.println("you finish the setup succsefuly " );
	}
	
	///------------
	
	
	public  static Vector<Slot> searchAppropiteSlots(double depth , double width  )
	{
	 Vector<Slot> appropiteSlot;
	 appropiteSlot = new Vector<Slot>();
	 
		for (int i=0; i<allSlot.size();i++)// what this fn do ??
		{
			if (allSlot.get(i).getLenght()>=depth && allSlot.get(i).getWidth()>=width )
			{
				appropiteSlot.add(allSlot.get(i));
			}
		}
		return appropiteSlot;
	}
	public static boolean searchAvaliableSlots ()
	{
		boolean flag=false;
		
		for (int i=0; i<allSlot.size() ;i++)
		{
			if (!allSlot.get(i).getFlag() )
			{
				avaliableSlot.add(allSlot.get(i));
				flag=true;
			}
		}
		return flag;
	}
	public static void displayAvaliableSlots ()
	{
		searchAvaliableSlots();
		for (int i=0; i<avaliableSlot.size() ;i++)
		{
			
			avaliableSlot.get(i).display();
		}
	}
	public static void addVehicleToVector(Vechile newVec  )
	{
		numOFViecle = numOFViecle + 1;
		allVehicle.add(newVec);
		newVec.display();
	}
	public static int getNumOfVehicle()
	{ 
		return numOFViecle;
	}
	public static void  addSlot (double len,double wid)
	{   
		
	//	System.out.println(" in add slot " );
		Slot newSlot = new Slot( len, wid);
		//System.out.println(" after create slot " );

		allSlot.add(newSlot);
		//System.out.println(" add ok " );

		}
	public  static Date setTime()
	 {
//		DateTimeFormatter myObj = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
//		  LocalDateTime now = LocalDateTime.now();
//		System.out.println(myObj.format(now));
		  

DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		  Date date = new Date();
		  //System.out.println(dateFormat.format(date));
		  return date;
		
	}
		
	}



