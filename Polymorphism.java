public class Polymorphism {

	public static void main(String[] args) {
		FactoryWorker worker = new FactoryWorker();
		worker.Count(4);
		worker.Count(5);
	}

	public static class FactoryWorker {
		public FactoryWorker () {

		}

		public void Count(int number) {
			Total += number;
			System.out.println(Total);
		}

		// class variable
		private int Total;
		public int getTotal() { return Total; }
		public void setTotal(int total) { this.Total = total; }

	}
}