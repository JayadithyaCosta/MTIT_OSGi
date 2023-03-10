package weddinghallpublisher;

import java.util.Random;
import java.util.Scanner;

public class WeddingHallImpl implements WeddingHall {

	@Override
	public void WeddingHall() {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("* * * * * * * *  Welcome to Wedding Hall & Food Arrangement Service  * * * * * * * * ");
		System.out.println("");
		System.out.print("Please Give Your Name : ");
		String Yname = scanner.next();

		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *  * * * ");
		System.out.println(" ");
		System.out.println(" WELCOME !! " + Yname);
		System.out.println("");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

		int choice = 1;
		
		while (choice == 1) {
			
			System.out.println("");
			System.out.println("**** *** ** *  Wedding Hall & Food Arrangement Service *  ** *** ****");
			System.out.println("");
			

			System.out.print("Do you already have a reservation? [1 = Yes || 2 = No]: ");
			int ord = scanner.nextInt();
			System.out.println("");
			

			Random random = new Random();
			int dispatch_number = random.nextInt(1000);
			int area;
			double additionalPrice;
			String orderNumber = "";
			
			if (ord == 1) {

				int choice1 = 1;

				while (choice1 == 1) {

					System.out.print("Please Enter the reservation number :  ");
					orderNumber = scanner.next();
					
					System.out.print("Please Enter Location:  [1 = Inside Colombo || 2 = Outside Colombo]: ");
					area = scanner.nextInt();
					additionalPrice = area == 1 ? 1500.00 : 2500.00;
					System.out.println("");
					
					if (area == 1 || area == 2) {
						
						System.out.println("Reservation Number \t: " + orderNumber);
						System.out.println("Reservation Name \t: " + Yname);
						System.out.println("Job Number \t\t: " + dispatch_number);
						System.out.println("Job Area \t\t: " + (area == 1 ? "Inside Colombo" : "Outside Colombo"));
						System.out.println("Additional Charges\t: " + additionalPrice);
						
						System.out.println("");
						System.out.println("Do you want to keep going ? [Type 1 = Yes | Type 2 = No] : ");
						choice= scanner.nextInt();

						if (choice == 2) {
							
							System.out.println("");
							System.out.println("* ! * ! * ! * ! * ! * ! * ! Thank You * ! * ! * ! * ! * ! * ! * ! *");
							System.out.println();
							break;
						}
					}
				}
			}
			
		 else {
			
			System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *  * * * ");
			System.out.println(" ");
			System.out.println(" To Create a new reservation please complete below questionnaire ");
			System.out.println("");
			System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			System.out.println("");
					
			System.out.println("Name of Bride \t: ");
			String brideName = scanner.next();
			
			System.out.println("Name of Groom \t: ");
			String groomName = scanner.next();
			
			System.out.println("Date of Arrangement \t: ");
			String arrangedDate = scanner.next();
			
			System.out.println("Number of Guests \t: ");
			int guestsNo = scanner.nextInt();
			
			System.out.print("Please Enter Location  [1 = Inside Colombo || 2 = Outside Colombo]: ");
			area = scanner.nextInt();
			additionalPrice = area == 1 ? 1500.00 : 2500.00;
			
			System.out.println("Do you need a DJ or a Live Band ?\t [Type 1 = DJ | Type 2 = Live Band]: ");
			int musicArrangement = scanner.nextInt();
			String typeOfMusicArrangement = musicArrangement == 1 ? "DJ" : "Live Band"; 
			
			System.out.println("Are there any food allergies for guests ?\t [Type 1 = Yes | Type 2 = No] ");
			int decFoods = scanner.nextInt();
			int allericGuests = 0;
			int hallPrice = 0;
			int pricePerPerson = 2000;
			int priceForTotGuests = pricePerPerson * guestsNo;
			String arrangedHallType;
			
			if (decFoods == 1) {
				System.out.println("How many Guests have Allergies?");
				allericGuests = scanner.nextInt();
			}
					
			
			if (guestsNo >= 50 && guestsNo <= 200) {
				arrangedHallType = "Marble Ballroom";
				hallPrice = 100000;
			}
			else if (guestsNo <= 50 && guestsNo >= 30) {
				arrangedHallType = "Hox Ballroom";
				hallPrice = 120000;
			}
			else if (guestsNo > 200) {
				arrangedHallType = "Grand Ballroom";
				hallPrice = 130000;
			}
			else {
				arrangedHallType = "Nevertrad Ballroom";
				hallPrice = 80000;
			}
			
			System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			
			System.out.println("");
			
			System.out.println("Do you need a Invoice ? [Type 1 = Yes | Type 2 = No] : ");
			int choiceInvoice = scanner.nextInt();
			int orderNumberNew = random.nextInt(100);
			
			if (choiceInvoice == 1) {
				
				System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *  * * * ");
				System.out.println(" ");
				System.out.println("* * * * * * * * * * * * * * * **  Invoice ** * * * * * * * * * * * * * * * * * ");
				System.out.println("");
				System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
				System.out.println("");
				
				System.out.println("Reservation Number \t\t: " + orderNumberNew);
				System.out.println("Reservation Name \t\t: " + Yname);
				System.out.println("Name of Bride & Groom \t\t: " + brideName + ", " + groomName);
				System.out.println("Arranged Date \t\t\t: " + arrangedDate);
				System.out.println("Number of Guests \t\t: " + guestsNo);
				System.out.println("Type of Music Arrangement \t: " + typeOfMusicArrangement);
				System.out.println("Guests with Food Allergies \t: " + allericGuests);
				System.out.println("Arranged Hall \t\t\t: " + arrangedHallType);
				System.out.println("Job Number \t\t\t: " + dispatch_number);
				System.out.println("Job Area \t\t\t: " + (area == 1 ? "Inside Colombo" : "Outside Colombo"));
				System.out.println("Additional Charges \t\t: " + additionalPrice);
				System.out.println("Arrangement Total Price \t: " + (priceForTotGuests + hallPrice + additionalPrice));
				
				System.out.println("");
				System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
				
			}
			
			
			System.out.println("Do you want to keep going ? [Type 1 = Yes | Type 2 = No] : ");
			choice= scanner.nextInt();

			if (choice == 2) {
				
				System.out.println("");
				System.out.println("* ! * ! * ! * ! * ! * ! * ! Thank You * ! * ! * ! * ! * ! * ! * ! *");
				System.out.println();
			}
		
				return;
			}
	
	
			
			while (choice != 1 && choice != 2) {
				
				System.out.println("");
				System.out.println("Invalid Input!");
				choice = scanner.nextInt();

				if (choice == 2) {
					
					System.out.println("");
					System.out.println("* * * * * * * * * * * * * * * * * Thank You * * * * * * * * * * * * * * * * * * * * * *");
					System.out.println("");
				}
			}
		}
		
	}
	
}