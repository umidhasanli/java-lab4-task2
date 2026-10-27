public class Main {
  public static void main(String[] args) {
    // Create a Car object using its constructor.
    Car car = new Car(
            "Corolla", "Toyota", 2023, 95000.0, "White", 5
    );

    // Display the original information.
    System.out.println("Original car:");
    System.out.println(car.toString());

    // Sell one car.
    car.sell();

    // Display every field using getters.
    System.out.println("\nAfter selling one car:");
    System.out.println("Model: " + car.getModel());
    System.out.println("Brand: " + car.getBrand());
    System.out.println("Year: " + car.getYear());
    System.out.println("Price: " + car.getPrice());
    System.out.println("Color: " + car.getColor());
    System.out.println("Quantity: " + car.getQuantity());

    // Change some fields using setters.
    car.setPrice(90000.0);
    car.setColor("Black");

    // Display the updated information.
    System.out.println("\nAfter changing price and color:");
    System.out.println(car.toString());

    // Demonstrate delivery.
    car.delivery();
    System.out.println("\nAfter receiving one car:");
    System.out.println(car.toString());
  }
}