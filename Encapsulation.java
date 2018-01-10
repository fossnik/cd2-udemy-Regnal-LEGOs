public class Encapsulation {

	public static void main(String[] args) {

		FactoryWorker worker = new FactoryWorker();
		int result = worker.AddNumbers(2, 3);

		System.out.println(result);

	}

	public static class FactoryWorker {

		public FactoryWorker() {

		}

		public int AddNumbers (int num1, int num2) {

			int result = num1 + num2;
			return result;

		}

	}

}
