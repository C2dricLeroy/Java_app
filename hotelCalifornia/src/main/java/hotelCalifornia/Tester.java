package hotelCalifornia;

public class Tester {

	public static void main(String[] args) {
		
		Room[] room = Room.createRoom();
		System.out.println("Bonjour et bienvenue à l'Hotel California!");
		int userCapacity = Billing.inputCapacity();
		int userCategory = Billing.inputCategory(userCapacity);
		boolean confirmation = Billing.confirmation(userCategory, userCapacity);
		if (confirmation) {
			Billing.filterCapacity(userCategory, userCapacity, room);
		} else {
			System.out.println("Veuillez relancer le programme.");
			System.exit(0);
		}
		boolean reservation = Billing.confirmation(userCategory, userCapacity);
		if (reservation) {
			System.out.println("Merci d'avoir réservé.");
		} else {
			System.out.println("Veuillez relancer le programme");
		}
	}
}
