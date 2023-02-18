import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Flight {
	
	String [][] seats = new String[5][5];
	String flightNo= "Flight no :TK3",name;
    int numOfPassengers,row,seat,seatControl=0;
    int maxNumOfSeats=25; 
   
    ArrayList<String> listOfPassengers = new ArrayList<>();
    Scanner scan = new Scanner(System.in); 
    
    
public  boolean reserveSeat() {
	
	System.out.println("Please enter your name");
	name = scan.next();	
	int x=0; // rezevasyon sonrasý ikinci for döngüsünden çýkabilmek için flag koyuyor

	for(int i=0;i<5; i++) {
		for(int j=0; j<5; j++) {
			
			if(seats[i][j]==null) {				//koltuk boþ ise isme göre rezervasyon yapýyor
				seats[i][j]=name;
				listOfPassengers.add(name);		//yolcu listesine ismi ekliyor
				System.out.println("The Reservation is Done!!!");
				System.out.println( flightNo  + "      Passenger:" +   name   + "	Row:"+ (i+1)   + "	Seat:"+ (j+1)  );
				x++;
				break;				
			}		
								}
		if(x!=0) {
			break;}		
							}			
	return true;
	}
	

	public  boolean cancelReservation() {
		
		
		System.out.println("Please enter your name");
		String cancelName = scan.next();
		
		
		
	
		int x=0;

		for(int i=0;i<5; i++) {
			for(int j=0; j<5; j++) {
				
				if(seats[i][j].equals(cancelName)) {				
					seats[i][j]=null;
					
					for(int k=0;k<listOfPassengers.size(); k++) {  // listedeki elemanlarý gezip ismi bulduðumuzda listeden siliyor
						String tempName =listOfPassengers.get(k);
						if(tempName.equals(cancelName)) {
							listOfPassengers.remove(k);
							
						}			
					}				
					System.out.println("Reservation cancelled!!!");	
					x++;
					break;				
				}		
									}
			if(x!=0) {
				break;}		
								}		
		return true;
		
	}
	
	
	public int	numberOfPassengers() {
		
	numOfPassengers=listOfPassengers.size();
		return numOfPassengers;
	}
	
	public void printPassengers() {
		
		Collections.sort(listOfPassengers);		
		System.out.println( "List of Passengers for " + flightNo);
		System.out.println( listOfPassengers);	
	}

	
	public void checkReservation() {
		
		int check=0;
		System.out.println("Please enter your name");
		String checkName = scan.next();
		
		for(int i=0;i<5; i++) {
			for(int j=0; j<5; j++) {
				if(seats[i][j].equals(checkName)) {
					System.out.println(flightNo);
					System.out.println("Passenger :"+ name);
					System.out.println("Row :" + (i+1) + "	Seat:"+ (j+1));
					check++;
					break;
				}
								
			}
			if(check!=0) {
				break;}			
		}
		if(check==0) {
			System.out.println("Reservation Not Found.");
		}	
	}   
}
