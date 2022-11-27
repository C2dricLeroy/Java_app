package hotelCalifornia;

public class Room {
	int id;
	int category;
	int capacity;
	int price; 
	boolean isAvailable;
	
	// Constructor
	public Room(int id, int cat, int cap, int price, boolean isAvailable) {
		this.id = id;
		this.category = cat;
		this.capacity = cap;
		this.price = price;
		this.isAvailable = isAvailable;
	}
	
	public static Room[] createRoom() {
		Room[] rooms = new Room[31];
		rooms[0] = new Room(1, 1, 1, 100, true);
		rooms[1] = new Room(2, 2, 1, 120, true);
		rooms[2] = new Room(3, 3, 1, 130, false);
		rooms[3] = new Room(4, 4, 1, 150, true);
		rooms[4] = new Room(5, 1, 2, 130, true);
		rooms[5] = new Room(6, 2, 2, 160, true);
		rooms[6] = new Room(7, 3, 2, 170, true);
		rooms[7] = new Room(8, 4, 2, 190, false);
		rooms[8] = new Room(9, 1, 3, 170, true);
		rooms[9] = new Room(10, 2, 3, 200, true);
		rooms[10] = new Room(11, 3, 3, 210, true);
		rooms[11] = new Room(12, 4, 3, 210, true);
		rooms[12] = new Room(13, 5, 3, 270, true);
		rooms[13] = new Room(14, 6, 3, 350, true);
		rooms[14] = new Room(15, 1, 4, 150, true);
		rooms[15] = new Room(16, 2, 4, 230, true);
		rooms[16] = new Room(17, 3, 4, 240, false);
		rooms[17] = new Room(18, 4, 4, 260, true);
		rooms[18] = new Room(19, 5, 4, 300, true);
		rooms[19] = new Room(20, 6, 4, 400, true);
		rooms[20] = new Room(21, 1, 1, 100, true);
		rooms[21] = new Room(22, 2, 2, 160, true);
		rooms[22] = new Room(23, 1, 2, 130, false);
		rooms[23] = new Room(24, 3, 1, 130, true);
		rooms[24] = new Room(25, 3, 2, 170, true);
		rooms[25] = new Room(26, 4, 4, 260, true);
		rooms[26] = new Room(27, 5, 4, 300, true);
		rooms[27] = new Room(28, 2, 2, 160, false);
		rooms[28] = new Room(29, 4, 3, 230, true);
		rooms[29] = new Room(30, 3, 2, 170, true);
		rooms[30] = new Room(31, 4, 2, 190, true);
		return rooms;
	}
	
	// Getters and setters
	public boolean isAvailable() {
		return isAvailable;
	}
	
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
