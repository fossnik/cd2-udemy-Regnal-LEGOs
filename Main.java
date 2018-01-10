public class Main {

	public static void main(String[] args) {
		Man man = new Man(true, "White", "Rodger");
		Kart kart = new Kart(true, "Black", "KNL");
		Alien alien = new Alien(true, "Green", "Kargon 5");

		System.out.println("Man is: " + man.color);
		System.out.println("Kart is: " + kart.color);
		System.out.println("Alien is: " + alien.color);
	}

	public static class Man {
		private Boolean moves;
		private String color;
		private String name;

		public Man(Boolean _moves, String _color, String _name) {
			this.moves = _moves;
			this.color = _color;
			this.name = _name;
		}

		public Boolean getMoves() { return moves; }
		public void setMoves(Boolean moves) { this.moves = moves; }

		public String getColor() { return color; }
		public void setColor(String color) { this.color = color; }

		public String getName() { return name; }
		public void setName(String name) { this.name = name; }
	}

	public static class Kart {
		private Boolean moves;
		private String color;
		private String manufacturer;

		// a public constructor for Kart
		public Kart(Boolean _moves, String _color, String _manufacturer) {
			this.moves = _moves;
			this.color = _color;
			this.manufacturer = _manufacturer;
		}

		public Boolean getMoves() { return moves; }
		public void setMoves(Boolean moves) { this.moves = moves; }

		public String getColor() { return color; }
		public void setColor(String color) { this.color = color; }

		public String getManufacturer() { return manufacturer; }
		public void setManufacturer(String manufacturer) { this.manufacturer = manufacturer; }
	}

	public static class Alien {
		private Boolean moves;
		private String color;
		private String planet;

		// a public constructor for Alien
		public Alien(Boolean _moves, String _color, String _planet) {
			this.moves = _moves;
			this.color = _color;
			this.planet = _planet;
		}

		public Boolean getMoves() { return moves; }
		public void setMoves(Boolean moves) { this.moves = moves; }

		public String getColor() { return color; }
		public void setColor(String color) { this.color = color; }

		public String getPlanet() { return planet; }
		public void setPlanet(String planet) { this.planet = planet; }
	}

}
