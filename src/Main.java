import java.util.Scanner;

enum VehicleType {
    car,
    Motorcycle,
    Truck
}
public class Vehicle {
    private String Brand;
    private  int year;
    private  VehicleType type;
    private float price;

    public Vehicle(String Brand, int year, VehicleType type, float price) {
        this.Brand = Brand;
        this.year = year;
        this.type = type;
        this.price = price;
    }
}

public void showDetails() {
    System.out.println("Brand: " + brand());
    System.out.println("Year: " + year());
    System.out.println("Type: " + type());
    System.out.println("Price: " + price());
}
public class customer {
    private String Brand;
    private VehicleType type;

    public customer(String Brand, VehicleType type) {
        this.name = name;
        this.Vehicle = Vehicle;
    }
    public double getTotalPrice() {
        return Vehicle.getPrice();
    }
    public void showDetails(){
        System.out.println("Customer Name: " + name());
        System.out.println("Type: " + type);
        Vehicle.showDetails();
        System.out.println("Total Price: " + getTotalPrice());
        System.println();
    }
}
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Vehicle VehicleSupraBapak = new Vehicle("Honda Supra", 1998, VehicldeType.Motorcycle, 3000.0);
        Vehicle VehicleKalcer = new Vehicle("VW Beetle", 1998, VehicleType.car, 200000.0);
        Vehicle VehicleGuede = new Vehicle ("Isuzu Giga", 2011, VehicleType.Truck, 300000.0);

        System.out.println("nter your customer name :");

        System.out.println("Enter customer 1 :");
        String name1 = Scanner.nextLine();

        System.out.println("Enter customer 2 :");
        String name2 = Scanner.nextLine();

        System.out.println("Enter customer 3 :");
        String name3 = Scanner.next.Line();

        System.out.println("====== Customer Service ======");

        System.out.println("Customer 1");
        Customer1.showDetails();

        System.out.println("Customer 2");
        customer2.showDetails();

        System.out.println("Customer 3");
        customer3.showDetails();

        scanner.close();
    }
}