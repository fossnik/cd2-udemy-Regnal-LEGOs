public class Main {

	public static void main(String[] args) {
		bullDozer dozer = new bullDozer("Yellow", "Mini");

		System.out.println("Bulldozer is: " + dozer.color);
	}

	public static class bullDozer {
		private String color;
		private String size;

		// a public constructor for bullDozer
		public bullDozer (String _color, String _size) {
			this.color = _color;
			this.size = _size;
		}

		public String getColor() { return color; }
		public void setColor(String color) { this.color = color; }

		public String getSize() { return size; }
		public void setSize(String size) { this.size = size; }
	}

}
