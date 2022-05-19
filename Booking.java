package inheritance1;

import java.util.Scanner;

class train{
	public void book() {
		Scanner train = new Scanner(System.in);
		System.out.println("which place");
		String place = train.next();
		System.out.println("seat type");
		String seattype = train.next();
		System.out.println("amount");
		int amount = train.nextInt();
		if (place.equals("chennai")) {
			if (seattype.equals("nonacseater")) {			
				if (amount > 200) {
				System.out.println("yes seat is available");
				} else {
					System.out.println("no seat is not available");
			   }
		     }	
		
			else if(seattype.equalsIgnoreCase("acseater")) {
				if(amount>250){
					System.out.println("yes seat is available");
				}else {
					System.out.println("no it is not available");
				}
			}
			else if(seattype.equals("sleeper")) {
				if(amount>300) {
					System.out.println("yes seat is available");
				}else {
					System.out.println("no it is not available");
				}
		}else 
			 {
				System.out.println("no it is not available");
		}
	  }
		if(place.equals("coimbatore")) {
			if (seattype.equals("nonacseater")) {			
				if (amount > 100) {
				System.out.println("yes seat is available");
				} else {
					System.out.println("no seat is not available");
			   }
		     }
			else if(seattype.equalsIgnoreCase("acseater")) {
				if(amount>150){
					System.out.println("yes seat is available");
				}else {
					System.out.println("no it is not available");
				}
			}
			else if(seattype.equals("sleeper")) {
				if(amount>250) {
					System.out.println("yes seat is available");
				}else {
					System.out.println("no it is not available");
				}
		}else 
			 {
				System.out.println("no it is not available");
		   }
		}
    }
}

class time extends train{
	public void select() {
		Scanner bus = new Scanner(System.in);
		System.out.println("which place");
		String place = bus.next();
		System.out.println("comfort");
		String comfort = bus.next();
		System.out.println("amount");
		int amount = bus.nextInt();
		if (place.equals("chennai")) {
			if (comfort.equals("ordinary")) {			
				if (amount > 250) {
				System.out.println("yes seat is available");
				} else {
					System.out.println("no seat is not available");
			   }
		     }	
		
			else if(comfort.equalsIgnoreCase("ultradeluxe")) {
				if(amount>350){
					System.out.println("yes seat is available");
				}else {
					System.out.println("no it is not available");
				}
			}
			else if(comfort.equals("sleeper")) {
				if(amount>500) {
					System.out.println("yes seat is available");
				}else {
					System.out.println("no it is not available");
				}
		}else 
			 {
				System.out.println("no it is not available");
		}
	  }
		if(place.equals("coimbatore")) {
			if (comfort.equals("ordinary")) {			
				if (amount > 150) {
				System.out.println("yes seat is available");
				} else {
					System.out.println("no seat is not available");
			   }
		     }
			else if(comfort.equalsIgnoreCase("ultradeluxe")) {
				if(amount>250){
					System.out.println("yes seat is available");
				}else {
					System.out.println("no it is not available");
				}
			}
			else if(comfort.equals("sleeper")) {
				if(amount>400) {
					System.out.println("yes seat is available");
				}else {
					System.out.println("no it is not available");
				}
		}else 
			 {
				System.out.println("no it is not available");
		   }
		}
	}
}
public class Booking {

	public static void main(String[] args) {
		time s = new time();
		s.book();
		s.select();

	}

}
