public class TermHW {

	public static void main(String[] args) {
		
		Car car1 = new Car("Red", "Toyota");
		System.out.format("Car 1 is a %s %s%n", car1.color, car1.manufacturer);

		SaloonCar saloonCar1 = new SaloonCar(2);
		SaloonCar saloonCar2 = new SaloonCar("Nissan", 3);
		SaloonCar saloonCar3 = new SaloonCar("Purple", "Ford", 4);
		System.out.format("SaloonCar 1 has %d seats%n", saloonCar1.numberOfSeats);
		System.out.format("SaloonCar 2 is a %s with %d seats%n", saloonCar2.manufacturer, saloonCar2.numberOfSeats);
		System.out.format("SaloonCar 3 is a %s %s with %d seats%n", saloonCar3.color, saloonCar3.manufacturer, saloonCar3.numberOfSeats);
		
	}

	public static class Car {
		public String color;
		public String manufacturer;

		// default constructor of inherited class
		public Car(String _color, String _manufacturer) {
			this.color = _color;
			this.manufacturer = _manufacturer;
		}

		public String getColor() { return color; }
		public void setColor(String color) { this.color = color; }

		public String getManufacturer() { return manufacturer; }
		public void setManufacturer(String manufacturer) { this.manufacturer = manufacturer; }
	}

	public static class SaloonCar extends Car {
		private int numberOfSeats;

		// constructor 1 (seats only)
		public SaloonCar(int _numberOfSeats) {
			super(null,null);
			this.numberOfSeats = _numberOfSeats;
		}

		// constructor 2 (seats and manufacturer)
		public SaloonCar(String _manufacturer, int _numberOfSeats) {
			super(null,_manufacturer);
			this.numberOfSeats = _numberOfSeats;
		}

		// constructor 3 (seats, manufacturer, and color)
		public SaloonCar(String _color, String _manufacturer, int _numberOfSeats) {
			super(_color, _manufacturer);
			this.numberOfSeats = _numberOfSeats;
		}

		public int getNumberOfSeats() { return numberOfSeats; }
		public void setNumberOfSeats(int numberOfSeats) { this.numberOfSeats = numberOfSeats; }
	}

}
