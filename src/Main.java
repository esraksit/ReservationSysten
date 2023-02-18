import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String continueControl="";
		Flight f = new Flight();      
		
		 while(continueControl!="no") {
		System.out.println("WELCOME");   // ana menü
		System.out.println("Please make a choice");
		System.out.println("1) Reserve a ticket");
		System.out.println("2) Cancel reservation");
		System.out.println("3) Check reservation");
		System.out.println("4) Display flight no and list of the passengers");
		
		Scanner scan = new Scanner(System.in);                
		int choice = scan.nextInt();
         
        
        switch(choice) {     //seçime göre methodlara yönlendiriyor
        
        case 1:
        	f.reserveSeat();
        	break;
        case 2:
        	f.cancelReservation();
        	break;
        case 3:
        	f.checkReservation();
        	break;
        case 4:
        	f.printPassengers();
        	break;
        	default:
        }
        
        System.out.println("Do you want to do anything else ?");
        continueControl = scan.next();
        
        
	}
        
	}
	

}
