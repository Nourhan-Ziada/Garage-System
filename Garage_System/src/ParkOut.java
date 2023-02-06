
 import java.time.LocalTime; // import the LocalTime class

 import java.text.DateFormat;
 import java.text.SimpleDateFormat;
 import java.util.Date;
 import java.time.format.DateTimeFormatter;
 import java.time.LocalDateTime;

public class ParkOut implements Parking {
	public void park (Vechile vehicle) {
		long fees;
		vehicle.setDepartureTime(Garage.setTime());
		Finance finance=new Finance();
		fees=finance.calculateFees(vehicle.getDepartureTime(),vehicle.getArrivalTime());
		finance.updateTotalIncome(fees);
		Garage.searchToSetFlag(vehicle);
		 Garage.deleteVehicle(vehicle);
		Boundry.displayFees(fees);
		
}
}