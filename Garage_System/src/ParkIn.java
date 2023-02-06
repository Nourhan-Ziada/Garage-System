import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Vector;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ParkIn implements Parking{
	public void park (Vechile vechile) {
		Vector<Slot> appropiteSlot ;
		 appropiteSlot = new Vector<Slot> ();
		 Slot chosedSlot = new Slot() ;
		 appropiteSlot= Garage.searchAppropiteSlots(vechile.getDepth() ,vechile.getWidth());
		
		chosedSlot = Garage.configuration.chooseSlot(appropiteSlot, vechile.getWidth(),vechile.getDepth() );
		

	// check that user do not input other number.
		int slotId = chosedSlot.getId();
		Date arrivalTime =  Garage.setTime();
		vechile.setArrivalTime(arrivalTime);
		vechile.setSlotId(slotId);
		chosedSlot.setFlag(true);

	
	
		Garage.addVehicleToVector(vechile);
		
		
	Boundry.confirmParking(slotId, vechile.getId());

		
	}

}
