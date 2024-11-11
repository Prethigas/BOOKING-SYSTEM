package TRAVEL;
import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;
public class BOOKING {
	String name;
	int id;
	Date date;
	
	BOOKING(Scanner sc)
	{
		System.out.println("Enter Passenger name: ");
		name=sc.next();
		System.out.println("Enter bus no: ");
		id=sc.nextInt();
		System.out.println("Enter date (dd-mm-yyyy): ");
		String n=sc.next();
			
		SimpleDateFormat sdf = new SimpleDateFormat("DD-MM-YYYY");
		try
		{
			date=sdf.parse(n);
		}
		catch(ParseException e)
		{
			e.printStackTrace();
		}
			
	}
	public boolean isavailable(ArrayList<TRAIN> no_of_trains, ArrayList<BOOKING> bookings)
	{
		int booked=0;
		int capacity=0;
		for(TRAIN bb : no_of_trains) 
		{
			if(bb.get_train() == id)
			{
				capacity = bb.get_capacity();
			}
		}
		for(BOOKING aa : bookings)
		{
			if(aa.id == id && aa.date.equals(date)) 
			{
				booked++;
			}
		}
		return booked<capacity;
	}
}
