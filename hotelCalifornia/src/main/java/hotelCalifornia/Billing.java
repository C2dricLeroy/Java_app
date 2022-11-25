package hotelCalifornia;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Billing {
	
	 static int inputCapacity() {
		Scanner in = new Scanner(System.in);
		System.out.println("Indiquez le nombre de personnes (max 4) : ");
		int userResponse = in.nextInt();
		if (userResponse < 1 || userResponse > 4) {
			System.out.println("Saisissez un nombre valide (max 4).");
			inputCapacity();
		}
		return userResponse;
	}
	
	public static int inputCategory(int userCapacity) {
		Scanner in = new Scanner(System.in);
		System.out.println("Veuillez entrer la catégorie souhaitée (de 1 à 6) : ");
		int userResponse = in.nextInt();
		if (userResponse < 1 || userResponse > 6) {
			System.out.println("Saisissez un nombre valide (De 1 à 6).");
			inputCategory(userCapacity);

		}
		System.out.println("Vous avez demandé une chambre de catégorie " + userResponse+ " pour " +userCapacity+ " personnes.");
		return userResponse;
	}
	
	public static boolean confirmation(int userCategory, int userCapacity) {
		Scanner in = new Scanner(System.in);
		System.out.println("Voulez-vous confirmer ? OUI / NON");
		String userResponse = in.nextLine();
		if (userResponse.equals("OUI")) {
			return true;
		} else {
			return false;
		}
		
	}
	
	static void filterCapacity (int userCategory, int userCapacity, Room[] room) {
		List<Room> response = new ArrayList<Room>();
		
		for (int i = 0; i < room.length; i++) {
			if (room[i].getCapacity() == userCapacity && room[i].getCategory() == userCapacity && room[i].isAvailable()) {
				response.add(room[i]);
				System.out.println("La chambre " + room[i].getId() + " est disponible au prix de " +room[i].getPrice()+ "€/nuit");
			} 
		}
		if (response.size() != 0) {
			for (int i = 0; i < response.size(); i++) {
				if (response.get(i).getCategory() == 1) {
					System.out.println("Les commodités de la chambre " + response.get(i).getId() +  " sont : Lavabo");
				} else if (response.get(i).getCategory() == 2) {
					System.out.println("Les commodités de la catégorie " + response.get(i).getId() +  " sont : WC, Télévision");
				} else if (response.get(i).getCategory() == 3) {
					System.out.println("Les commodités de la catégorie " + response.get(i).getId() +  " sont : Télévision, Cabine de douche");
				} else if (response.get(i).getCategory() == 4) {
					System.out.println("Les commodités de la catégorie " + response.get(i).getId() +  " sont : WC, Télévision, Cabine de douche");
				} else if (response.get(i).getCategory() == 5) {
					System.out.println("Les commodités de la catégorie " + response.get(i).getId() +  " sont : WC, Télévision, Cabine de douche, Salle de Bain");
				} else if (response.get(i).getCategory() == 6) {
					System.out.println("Les commodités de la catégorie " + response.get(i).getId() +  " sont : 2 pièces, WC, Télévision, Cabine de douche, Salle de Bain");
				}
			}
		} else {
			System.out.println("Oups, il n'y a plus de chambre disponible, veuillez recommencer.");
			inputCapacity();
		}
		
	}
}
