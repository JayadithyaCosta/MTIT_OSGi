package photoPublisher;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class PhotoServicePublishImpl implements PhotoServicePublish{

	public void publishService() {

			Scanner sc = new Scanner(System.in);
			
			DateTimeFormatter dft = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
			LocalDateTime now = LocalDateTime.now();
			
		    String customerName;
		    String date;
		    String address;
		    String phoneNo;
		    String packageType;
		    String category;
		    String confirm;
		    
		    int order = 1;
		    
		    while(order == 1){
		        System.out.println("********** Welcome to Fairy Weddings Photos and Videography **********");
			    System.out.println();
		     
	    	    System.out.println("These are available packages");
	    	    System.out.println();
	    	    System.out.println("------------------------------");
	    	    System.out.println("Package     Services");
	    	    System.out.println("  A         Couple photos");
	    	    System.out.println("  B         Couple and Family photos");
	    	    System.out.println("  C         Couple videos with photos");
	    	    System.out.println("------------------------------");
	    	    System.out.println();
	    	    
	    	    System.out.print("Enter the package type : ");
	    	    packageType = sc.next();
	    	    System.out.println();
	    	    
	    	    if(packageType.equals("A")){
	    	        System.out.println("These are available categories");
	        	    System.out.println("------------------------------");
	        	    System.out.println("Categoray      Name                     Prices");
	        	    System.out.println("  A         Jungle Beach                30000.00");
	        	    System.out.println("  B         Cliff Wedding               40000.00");
	        	    System.out.println("  C         Pre Wedding or Love Story   50000.00");
	        	    System.out.println("  D         Traditional Style Wedding   60000.00");
	        	    System.out.println("  E         Elephant Wedding            70000.00");
	        	    System.out.println("------------------------------");
	        	    System.out.println();
	        	    
	        	    System.out.print("Please select the category : ");
	    	        category = sc.next();
	        	    
	        	    if(category.equals("A")){
	        	        System.out.println("Thank you for selecting our 'Jungle Beach' couple photos package for your big day");
	        	        System.out.println("Your total amount : Rs.30000.00");
	        	    }
	        	    else if(category.equals("B")){
	        	        System.out.println("Thank you for selecting our 'Cliff Wedding' couple photos package for your big day");
	        	        System.out.println("Your total amount : Rs.40000.00"); 
	        	    }
	        	    else if(category.equals("C")){
	        	        System.out.println("Thank you for selecting our 'Pre Wedding or Love Story' couple photos package for your big day");
	        	        System.out.println("Your total amount : Rs.50000.00");
	        	    }
	        	    else if(category.equals("D")){
	        	        System.out.println("Thank you for selecting our 'Traditional Style Wedding' couple photos package for your big day");
	        	        System.out.println("Your total amount : Rs.60000.00");
	        	    }
	        	    else if(category.equals("E")){
	        	        System.out.println("Thank you for selecting our 'Elephant Wedding' couple photos package for your big day");
	        	        System.out.println("Your total amount : Rs.70000.00");
	        	    }
	        	    else{
	        	        System.out.println("Sorry, You have entered the wrong package");
	        	        return;
	        	    }
	    	    }
	    	    else if(packageType.equals("B")){
	    	        System.out.println("These are available categories");
	        	    System.out.println("------------------------------");
	        	    System.out.println("Categoray      Name                     Prices");
	        	    System.out.println("  A         Jungle Beach                40000.00");
	        	    System.out.println("  B         Cliff Wedding               50000.00");
	        	    System.out.println("  C         Traditional Style Wedding   60000.00");
	        	    System.out.println("------------------------------");
	        	    System.out.println();
	        	    
	        	    System.out.print("Please select the category : ");
	    	        category = sc.next();
	        	    
	        	    if(category.equals("A")){
	        	        System.out.println("Thank you for selecting our 'Jungle Beach' family photos package for your big day");
	        	        System.out.println("Your total amount : Rs.40000.00");
	        	    }
	        	    else if(category.equals("B")){
	        	        System.out.println("Thank you for selecting our 'Cliff Wedding' family photos package for your big day");
	        	        System.out.println("Your total amount : Rs.50000.00");
	        	    }
	        	    else if(category.equals("C")){
	        	        System.out.println("Thank you for selecting our 'Traditional Style Wedding' family photos package for your big day");
	        	        System.out.println("Your total amount : Rs.60000.00");
	        	    }
	        	    else{
	        	        System.out.println("Sorry, You have entered the wrong package");
	        	        return;
	        	    }
	    	    }
	    	    else if(packageType.equals("C")){
	    	        System.out.println("These are available categories");
	        	    System.out.println("------------------------------");
	        	    System.out.println("Categoray      Name                     Prices");
	        	    System.out.println("  A         Jungle Beach                35000.00");
	        	    System.out.println("  B         Cliff Wedding               45000.00");
	        	    System.out.println("  C         Pre Wedding or Love Story   55000.00");
	        	    System.out.println("  D         Traditional Style Wedding   65000.00");
	        	    System.out.println("  E         Elephant Wedding            75000.00");
	        	    System.out.println("------------------------------");
	        	    System.out.println();
	        	    
	        	    System.out.print("Please select the category : ");
	    	        category = sc.next();
	        	    
	        	    if(category.equals("A")){
	        	        System.out.println("Thank you for selecting our 'Jungle Beach' couple videos and photos package for your big day");
	        	        System.out.println("Your total amount : Rs.35000.00");
	        	    }
	        	    else if(category.equals("B")){
	        	        System.out.println("Thank you for selecting our 'Cliff Wedding' couple videos and photos package for your big day");
	        	        System.out.println("Your total amount : Rs.45000.00");
	        	    }
	        	    else if(category.equals("C")){
	        	        System.out.println("Thank you for selecting our 'Pre Wedding or Love Story' couple videos and photos package for your big day");
	        	        System.out.println("Your total amount : Rs.55000.00");
	        	    }
	        	    else if(category.equals("D")){
	        	        System.out.println("Thank you for selecting our 'Traditional Style Wedding' couple videos and photos package for your big day");
	        	        System.out.println("Your total amount : Rs.65000.00");
	        	    }
	        	    else if(category.equals("E")){
	        	        System.out.println("Thank you for selecting our 'Elephant Wedding' couple videos and photos package for your big day");
	        	        System.out.println("Your total amount : Rs.75000.00");
	        	    }
	        	    else{
	        	        System.out.println("Sorry, You have entered the wrong package");
	        	        return;
	        	    }
	    	    }
	    	    else{
	    	        System.out.println("Sorry, the entered package is not available in our system. Can't continue the order.");
	    	        return;
	    	    }
	    	    
	    	    System.out.println();
	    	    System.out.print("Do you want to confirm the order [Y/N]? : ");
	    	    confirm = sc.next();
	    	    
	    	    if(confirm.equals("Y")){
	    	        System.out.print("Please enter the wedding date : ");
	    	        date = sc.next();
	    	        System.out.println();
	    	        
	    	        System.out.print("Please enter your name : ");
	    	        customerName = sc.next();
	    	        System.out.println();
	    	        
	    	        System.out.print("Please enter the address : ");
	    	        address = sc.next();
	    	        System.out.println();
	    	        
	    	        System.out.print("Please enter the phone number : ");
	    	        phoneNo = sc.next();
	    	        System.out.println();
	    	        
	    	        System.out.println("****************************************************************************");
	    			System.out.println("Thank you " + customerName + " for your valuable order with Fairy Weddings");
	    			System.out.println();
	    		    System.out.println("Your order details sent to " + phoneNo);
	    		    System.out.println("Your album will receive to " + address);
	    		    System.out.println("Booking confirmation date " + dft.format(now));
	    		    System.out.println("We will contact you soon");
	    		    System.out.println("****************************************************************************");
	    			return;
	    	    }
	    	    
	    	    else{
	    	        System.out.println("Good Bye Fairy Weddings !!!");
	    	        return;
	    	    }
		    }
	    	    
		}
	}

		
	



