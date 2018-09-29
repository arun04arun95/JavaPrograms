import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.projects.railways.ReservationForm;
import com.projects.railways.Domain.PassengerDomain;

public class RailwayProject {

	public static void main(String[] args) {
		ReservationForm form = new ReservationForm();
		List<PassengerDomain> passengers = new ArrayList<>();
		PassengerDomain passenger = new PassengerDomain();
		passenger.setAge(21);
		Date dob = new Date("04/04/1994");
		passenger.setDob(dob);
		passenger.setName("Arun");
		System.out.println(passenger.getDob());
		passengers.add(passenger);
		
		

	}
}