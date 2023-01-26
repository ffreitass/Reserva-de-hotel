import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.reservation;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			System.out.print("Room number:   ");
			int number = sc.nextInt();
			System.out.print("Check-in date (dd/MM/yyyy)");
			Date checkIn = sdf.parse(sc.nextLine());
			System.out.print("Check-out date (dd/MM/yyyy)");
			Date checkOut = sdf.parse(sc.nextLine());
			
			
			reservation res = new reservation(number,checkIn,checkOut );
			System.out.print("Reservation" + res);
			
			System.out.println();
			System.out.println("Enter data to update the resevation");
			System.out.print("Check-in date (dd/MM/yyyy)");
			checkIn = sdf.parse(sc.nextLine());
			System.out.print("Check-out date (dd/MM/yyyy)");
			checkOut = sdf.parse(sc.nextLine());
			
			res.updateDates(checkIn, checkOut);
			System.out.println("Resevation" + res);
	
		}
		
		catch(ParseException e) {
			System.out.println("Invalid date format");
		}
		 catch( IllegalArgumentException e ) {
			 System.out.println("Error in reservation " + e.getMessage());
		 }
		
		
		
		
		sc.close();

	}

}
