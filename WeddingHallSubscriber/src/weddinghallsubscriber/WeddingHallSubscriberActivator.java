package weddinghallsubscriber;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import weddinghallpublisher.WeddingHall;

public class WeddingHallSubscriberActivator implements BundleActivator {

	ServiceReference serviceReference;

	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("Start Fairy Weddings Subscriber Service");
		serviceReference = context.getServiceReference(WeddingHall.class.getName());
		WeddingHall weddingHallArrangementServicePublish = (WeddingHall) context.getService(serviceReference);
		
		Scanner sc = new Scanner(System.in);
		
		int choice = 1;
		while(choice == 1) {
			
			System.out.println("");
			System.out.println("                            Welcome to Fairy Weddings                        ");
			System.out.println("");

			System.out.println("\t\t               Our Services                 ");
			System.out.println("\t\t    ----------------------------------------");
			System.out.println("");
			System.out.println("\t\t\t    1. Wedding food and hall");
			System.out.println("\t\t\t    2. Flower and hall decorations");
			System.out.println("\t\t\t    3. Photos and videography");
			System.out.println("\t\t\t    4. Bride and Groom dressings");
			System.out.println("\t\t\t    0. Exit");
			System.out.println("");
			System.out.println("\t\t    ----------------------------------------");
			System.out.println("");
			
			System.out.print("Please select a service (1/2/3/4/0) : ");
			int service = sc.nextInt();
			
			if (service == 1) {
				System.out.println("");
//				flowerServicePublish.publishService();
				weddingHallArrangementServicePublish.WeddingHall();
				System.out.println("");

				System.out.print("Do you want to get another service [Yes=1 | No=2]? : ");
				choice = sc.nextInt();

				if (choice == 2) {
					System.out.println("");
					System.out.println("* * * * * * * * * * * * * * * * * THANK YOU * * * * * * * * * * * * * * * * * * * * *");
					System.out.println("");
				
				}

			}else if (service == 0) {

				System.out.println("");
				System.out.println("                                THANK YOU                                 ");
				System.out.println("");
				return;

			} else {
				System.out.println("");
				System.out.print("Invalid Number!!Do you want to continue.? [Type 1 = Yes | Type 2 = No] : ");
				choice = sc.nextInt();

				if (choice == 2) {
					System.out.println("");
					System.out.println("                            THANK YOU                               ");
					System.out.println("");
				}
			}
			
			while (choice != 1 && choice != 2) {
				System.out.println("");
				System.out.println("Invalid Input.");
				System.out.print("Type 1 = Continue | Type 2 = Exit : ");
				choice = sc.nextInt();

				if (choice == 2) {
					System.out.println();
					System.out.println("**********************************THANK YOU********************************************");
					System.out.println("");
				}
			}
		}
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Good Bye Fairy Weddings!!!");
		context.ungetService(serviceReference);
	}

}
