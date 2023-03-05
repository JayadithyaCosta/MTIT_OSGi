package weddingdressespublisher;

import java.util.Random;
import java.util.Scanner;

public class WeddingDressesImpl implements WeddingDressesPublisher {

	@Override
	public void WeddingDresses() {
		
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
			System.out.println("**** *** ** *  Wedding Dresses Hire or Buy service *  ** *** ****");
			System.out.println("");
			

			
			System.out.print("Do you need to buy or hire a Weddding dress? [1 = Buy || 2 = Hire]: ");
			int input = scanner.nextInt();
			System.out.println("");
			

			Random random = new Random();
			int dispatch_number = random.nextInt(1000);
			int area;
			double additionalPrice;
			
			
			
			if (input == 1) {

				int choice1 = 1;

				while (choice1 == 1) {
					
					
					System.out.println("\t\t              Buy Available Dresses                 ");
					System.out.println("\t\t    ----------------------------------------");
					System.out.println("");
					System.out.println("\t\t\t    1. Full length white Bonna Wedding dress Rs1000.00 ");
					System.out.println("\t\t\t    2. Low waist Heley Dress Rs2000.00 ");
					System.out.println("\t\t\t    3. Jasmin Empire white wedding dress Rs3500.00 ");
					System.out.println("\t\t\t    4. Tulipia Red dress Rs4000.00");
					System.out.println("\t\t\t    0. Exit");
					System.out.println("");
					System.out.println("\t\t    ----------------------------------------");
					System.out.println("");
					
					System.out.print("Please select a dress (1/2/3/4/0) : ");
					int buyDressType = scanner.nextInt();
					double dressPrice = 0.00;
					String dressColor = "";
					String dressType = "";
					
					if (buyDressType == 0) {
						break;
					}
					
					switch (buyDressType) {
					case 1: {
						dressPrice = 1000.00;
						dressColor = "White";
						dressType = "Bonna";
						break;
					}
					case 2: {
						dressPrice = 2000.00;
						dressColor = "White";
						dressType = "Heley";
						break;
					}
					case 3: {
						dressPrice = 3500.00;
						dressColor = "White";
						dressType = "Jasmin Empire";
						break;
					}
					case 4: {
						dressPrice = 4000.00;
						dressColor = "Red";
						dressType = "Tulipia";
						break;
					}
					default:
						throw new IllegalArgumentException("Unexpected value: " + buyDressType);
					}

					
					System.out.print("Select a Size (US) \t: ");
					int dressSizeInput = scanner.nextInt();
					
					System.out.print("Enter number of dresses needed \t: ");
					int dressesQuantity = scanner.nextInt();
					
					System.out.print("Please Enter Location:  [1 = Inside Colombo || 2 = Outside Colombo]: ");
					area = scanner.nextInt();
					additionalPrice = area == 1 ? 400.00 : 600.00;
					System.out.println("");
					
					if (area == 1 || area == 2) {
						
						System.out.println("Order Number \t\t: " + dispatch_number);
						System.out.println("Recipient Name \t\t: " + Yname);
						System.out.println("Dress Type \t\t: " + dressType);
						System.out.println("Dress Color \t\t: " + dressColor);
						System.out.println("Quantity \t\t: " + dressesQuantity);
						System.out.println("Delivery Area \t\t: " + (area == 1 ? "Inside Colombo" : "Outside Colombo"));
						System.out.println("Additional Charges\t: " + additionalPrice);
						System.out.println("Total Price \t\t: " + ((dressPrice * dressesQuantity) + additionalPrice));
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
			
			 System.out.println("\t\t              Hire Available Dresses                 ");
			 System.out.println("\t\t    ----------------------------------------");
			 System.out.println("");
			 System.out.println("\t\t\t    1. Full length white Bonna Wedding dress Rs100.00 ");
			 System.out.println("\t\t\t    2. Low waist Heley Dress Rs300.00 ");
			 System.out.println("\t\t\t    3. Jasmin Empire white wedding dress Rs400.00 ");
			 System.out.println("\t\t\t    4. Tulipia Red dress Rs500.00");
			 System.out.println("\t\t\t    0. Exit");
			 System.out.println("");
			 System.out.println("\t\t    ----------------------------------------");
			 System.out.println("");
			 
			 System.out.print("Please select a dress (1/2/3/4/0) : ");
				int buyDressType = scanner.nextInt();
				double dressRentalPrice = 0.00;
				String dressColor = "";
				String dressType = "";
				
				if (buyDressType == 0) {
					break;
				}
				
				switch (buyDressType) {
				case 1: {
					dressRentalPrice = 100.00;
					dressColor = "White";
					dressType = "Bonna";
					break;
				}
				case 2: {
					dressRentalPrice = 300.00;
					dressColor = "White";
					dressType = "Heley";
					break;
				}
				case 3: {
					dressRentalPrice = 400.00;
					dressColor = "White";
					dressType = "Jasmin Empire";
					break;
				}
				case 4: {
					dressRentalPrice = 500.00;
					dressColor = "Red";
					dressType = "Tulipia";
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + buyDressType);
				}

					
				System.out.print("Select a Size (US) \t: ");
				int dressSizeInput = scanner.nextInt();
				
				System.out.print("Enter number of dresses needed \t: ");
				int dressesQuantity = scanner.nextInt();
				
				System.out.print("Rental Period (days)\t: ");
				int rentalPeriod = scanner.nextInt();
				
				System.out.print("Please Enter Location:  [1 = Inside Colombo || 2 = Outside Colombo]: ");
				area = scanner.nextInt();
				additionalPrice = area == 1 ? 400.00 : 800.00;
				System.out.println("");
				
				if (area == 1 || area == 2) {
					
					System.out.println("Order Number \t\t: " + dispatch_number);
					System.out.println("Recipient Name \t\t: " + Yname);
					System.out.println("Dress Type \t\t: " + dressType);
					System.out.println("Dress Color \t\t: " + dressColor);
					System.out.println("Quantity \t\t: " + dressesQuantity);
					System.out.println("Rental Period \t\t: " + rentalPeriod);
					System.out.println("Delivery Area \t\t: " + (area == 1 ? "Inside Colombo" : "Outside Colombo"));
					System.out.println("Additional Charges\t: " + additionalPrice);
					System.out.println("Total Price \t\t: " + (((dressRentalPrice * rentalPeriod)) + (dressRentalPrice * dressesQuantity)  + additionalPrice));
					System.out.println("");
					System.out.println("Do you want to keep going ? [Type 1 = Yes | Type 2 = No] : ");
					choice= scanner.nextInt();
				
			
			
			System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		}

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
