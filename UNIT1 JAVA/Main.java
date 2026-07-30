class Car {
      String brand="Toyota";

      void start() {
	System.out.println("Car Started");
      }
}

public class Main {
	public static void main(String[] args) {
                        Car c1 = new Car();
	         System.out.println(c1.brand);
	         c1.start();
      }
}
