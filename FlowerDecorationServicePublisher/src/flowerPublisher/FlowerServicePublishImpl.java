package flowerPublisher;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FlowerServicePublishImpl implements FlowerServicePublish {

	public void publishService() {
		Scanner sc = new Scanner(System.in);
		
		String customerName;
		String phoneNumber;
		String flowerType;
		String flowerColor;
		String confirm;
		String packageType;
		
		int answer = 1;
		int flowerCount;
		int tableCount;
		
		double total = 0;
		double finalTotal = 0;
		double flowerTotal = 0;
		
		DateTimeFormatter dft = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		
		while(answer == 1) {
		    System.out.println("********** Welcome to Fairy Weddings Flowers and Decorations **********");
		    System.out.println();
		
			System.out.print("Plese enter your full name : ");
			customerName = sc.nextLine();
			System.out.println();
			
			System.out.print("Plese enter the phone number : ");
			phoneNumber = sc.nextLine();
			System.out.println();
			
			System.out.println("Welcome " + customerName);
			System.out.println();
			
			System.out.println("*** Select our available fresh flowers and decoration packages to beautify your big day ***");
			System.out.println();
			
			System.out.println("These are the available flowers and prices");
			System.out.println();
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("	Flower Type		Flower Name		Price(Rs. per flower)");
			System.out.println("	C			Carnation		50.00 ");
			System.out.println("	D			Daffodil		60.00 ");
			System.out.println("	G			Gerbera			40.00 ");
			System.out.println("	L			Lily			45.00 ");
			System.out.println("	O			Orchid			55.00 ");
			System.out.println("	P			Peony			70.00 ");
			System.out.println("	R			Rose			65.00 ");
			System.out.println("----------------------------------------------------------------------------");
			System.out.println();
			
			System.out.println("Please refer the price chart to make the order"); 
			
			System.out.print("How many flowers would like to purchase? : ");
			flowerCount = sc.nextInt();
			System.out.println("");
			
			System.out.print("How many guest tables do you want? (Rs.2000.00 per table) : ");
			tableCount = sc.nextInt();
			System.out.println("");
			
			System.out.println("We can provide any colours for flowers");
			System.out.print("Please enter the colour : ");
			flowerColor = sc.next();
			System.out.println("");
			
			System.out.print("Please enter the flower type : ");
			flowerType = sc.next();
			System.out.println("");
			
			if(flowerType.equals("C")) {
				flowerTotal = flowerCount * 50 + tableCount * 2000;
			}
			else if(flowerType.equals("D")) {
				flowerTotal = flowerCount * 60 + tableCount * 2000;
				
			}
			else if(flowerType.equals("G")) {
				flowerTotal = flowerCount * 40 + tableCount * 2000;
				
			}
			else if(flowerType.equals("L")) {
				flowerTotal = flowerCount * 45 + tableCount * 2000;
				
			}
			else if(flowerType.equals("O")) {
				flowerTotal = flowerCount * 55 + tableCount * 2000;
				
			}
			else if(flowerType.equals("P")) {
				flowerTotal = flowerCount * 70 + tableCount * 2000;
				
			}
			else if(flowerType.equals("R")) {
				flowerTotal = flowerCount * 65 + tableCount * 2000;
				
			}
			else {
				System.out.println("You have selected a wrong flower type, So can't continue the order :(");
				return;
			}
			
			System.out.println("These are available packages and prices");
			System.out.println();
			System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("	Package Type		Bride			Bridesmaids			Flower girls			Price(Rs.)");
			System.out.println("	A			Yes			Yes				Yes				50000.00");
			System.out.println("	B			Yes			Yes				No				30000.00");
			System.out.println("	C			Yes			No				No				25000.00");
			System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
			System.out.println();
			
			System.out.print("Please enter the package type : " );
			packageType = sc.next();
			System.out.println();
			
			if(packageType.equals("A")) {
				total = 50000 + flowerTotal;
			}
			else if(packageType.equals("B")) {
				total = 30000 + flowerTotal;
			}
			else if(packageType.equals("C")) {
				total = 25000 + flowerTotal;
			}
			else {
				System.out.println("You have selected a wrong flower type, So can't continue the order :(");
				return;
			}
			
			System.out.print("Do you confirm the order [Y/N]? : ");
			confirm = sc.next();
			System.out.println();
			
			if(confirm.equals("Y")) {
				if(total >= 100000.00) {
					System.out.println("*** Congratulations!!! You receive a 10% discount ***");
					finalTotal = total - (Math.round(total * 10) / 100.0);
					System.out.println("Here is your total bill");
					System.out.println("");
					System.out.println("-------------------------------------------");
					System.out.println("    Flower type			: " + flowerType);
					System.out.println("    Flower colour		: " + flowerColor);
					System.out.println("    No of guest tables		: " + tableCount);
					System.out.println("    No of flowers		: " + flowerCount);
					System.out.println("    Bouquet package		: " + packageType);
					System.out.println("    Total amount		: " + finalTotal);
					System.out.println("-------------------------------------------");
				}
				else {
					System.out.println("Here is your total bill");
					System.out.println("");
					System.out.println("-------------------------------------------");
					System.out.println("    Flower type			: " + flowerType);
					System.out.println("    Flower colour			: " + flowerColor);
					System.out.println("    No of guest tables	: " + tableCount);
					System.out.println("    No of flowers		: " + flowerCount);
					System.out.println("    Bouquet package		: " + packageType);
					System.out.println("    Total amount		: " + total);
					System.out.println("-------------------------------------------");
				}
				
				System.out.println();
				System.out.println("Thank you " + customerName + " for your valuable order with Fairy Weddings");
			    System.out.println("Your order details sent to " + phoneNumber);
			    System.out.println("Order date " + dft.format(now));
			    System.out.println("****************************************************************************");
				return;
				
			}
			else{
			    System.out.print("Good Bye Fairy Weddings !!!");
			    return;
			}
		}
	}
}