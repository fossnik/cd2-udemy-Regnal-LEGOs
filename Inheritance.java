public class Inheritance {

	public static void main(String[] args) {
		Man man = new Man(true, "White", "Rodger");
		Kart kart = new Kart(true, "Black", "KNL");
		Alien alien = new Alien(true, "Green", "Kargon 5");

		System.out.println("SaloonCar is: " + man.color);
		System.out.println("Kart is: " + kart.color);
		System.out.println("Alien is: " + alien.color);
	}

	public static class GeneralObject {
		public Boolean moves;
		public String color;

		// default constructor of inherited class
		public GeneralObject(Boolean _moves, String _color) {
			this.moves = _moves;
			this.color = _color;
		}

		public Boolean getMoves() { return moves; }
		public void setMoves(Boolean moves) { this.moves = moves; }

		public String getColor() { return color; }
		public void setColor(String color) { this.color = color; }
	}

	public static class Man extends GeneralObject {
		private String name;

		// a public constructor for Kart
		public Man(Boolean _moves, String _color, String _name) {
			super(_moves, _color);
			this.name = _name;
		}

		public String getName() { return name; }
		public void setName(String name) { this.name = name; }
	}

	public static class Kart extends GeneralObject {
		private String manufacturer;

		// a public constructor for Kart
		public Kart(Boolean _moves, String _color, String _manufacturer) {
			super(_moves, _color);
			this.manufacturer = _manufacturer;
		}

		public String getManufacturer() { return manufacturer; }
		public void setManufacturer(String manufacturer) { this.manufacturer = manufacturer; }
	}

	public static class Alien extends GeneralObject {
		private String planet;

		// a public constructor for Alien
		public Alien(Boolean _moves, String _color, String _planet) {
			super(_moves, _color);
			this.planet = _planet;
		}

		public String getPlanet() { return planet; }
		public void setPlanet(String planet) { this.planet = planet; }
	}

}
