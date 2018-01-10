public class Polymorphism {

	public static void main(String[] args) {
		FactoryWorker worker = new FactoryWorker();
		worker.Count(4);
		worker.Count(5);

		worker.Count(4.5);
	}

	public static class FactoryWorker {
		public FactoryWorker () {

		}

		public void Count(int number) {
			Total += number;
			System.out.println(Total);
		}

		// overloaded method to accept floating point numbers
		public void Count(double number) {
			Total += number;
			System.out.println(Total);
		}

		// class variable
		private float Total;
		public float getTotal() { return Total; }
		public void setTotal(int total) { this.Total = total; }
	}
}