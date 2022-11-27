package hotelCalifornia;

public class Tester {

	public static void main(String[] args) {
		
		Room[] room = Room.createRoom();
		
		System.out.println(
				"\n"
				+ "  _           _       _             _ _  __                 _       \n"
				+ " | |         | |     | |           | (_)/ _|               (_)      \n"
				+ " | |__   ___ | |_ ___| |   ___ __ _| |_| |_ ___  _ __ _ __  _  __ _ \n"
				+ " | '_ \\ / _ \\| __/ _ \\ |  / __/ _` | | |  _/ _ \\| '__| '_ \\| |/ _` |\n"
				+ " | | | | (_) | ||  __/ | | (_| (_| | | | || (_) | |  | | | | | (_| |\n"
				+ " |_| |_|\\___/ \\__\\___|_|  \\___\\__,_|_|_|_| \\___/|_|  |_| |_|_|\\__,_|\n"
				+ "                                                                    \n"
				+ "                                                                    \n"
				+ "");
		
		while (true){
			System.out.println("\n");
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
		int roomConfirm = Billing.userConfirmation();
		boolean reservation = Billing.confirmation(userCategory, userCapacity);
		if (reservation) {
			System.out.println("Merci d'avoir réservé.");
			room[roomConfirm - 1].setAvailable(false);
		} else {
			System.out.println("Veuillez relancer le programme.");
		}
		}
	}

}
