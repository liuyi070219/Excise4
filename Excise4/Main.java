package Excise4;

public class Main {
    public static void main(String[] args) {
        ERyder bike1 = new ERyder();
        System.out.println("Bike 1");
        bike1.printBikeDetails();
        ERyder bike2 = new ERyder("EB002", 75, true, 125.5, "Eryder", 18531893871L,0, 0);
        System.out.println("Bike 2");
        bike2.ride();
        bike2.calculateFare(30);
        bike2.printBikeDetails();
    }
}
