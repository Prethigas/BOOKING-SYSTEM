package TRAVEL;
import java.util.*;

public class MAIN {
	public static void main(String[] args)
	{
		ArrayList<TRAIN> no_of_trains = new ArrayList<>();
		ArrayList<BOOKING> bookings = new ArrayList<>();
		no_of_trains.add(new TRAIN(1,true,25));
		no_of_trains.add(new TRAIN(2,true,50));
		no_of_trains.add(new TRAIN(3,true,2));
		
		for(TRAIN a:no_of_trains) 
		{
			a.display();
		}
		
		Scanner sc = new Scanner(System.in);
		int ch = 1;
		while(ch==1) {
			System.out.println("Enter 1 to book ,Enter 2 to exit");
			sc.nextInt();
			BOOKING b = new BOOKING(sc);
			if(b.isavailable(no_of_trains,bookings))
			{
				System.out.println("Your Booking is Confirmed");
				bookings.add(b);
			}
			else
			{
				System.out.println("Sorry!,seats are filled");
			}
		}
		sc.close();
	}
}
