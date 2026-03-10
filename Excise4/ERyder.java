package Excise4;

public class ERyder {
//    属性
    public static final String COMPANY_NAME = "ERyder";
    public static final double BASE_FARE = 1.0;
    public static final double PER_MINUTE_FARE = 0.5;
    private String bikeID;
    private int batteryLevel;
    private boolean isAvailable;
    private double kmDriven;
    private String LINKED_ACCOUNT;
    private long LINKED_PHONE_NUMBER;
    private int totalUsageInMinutes;
    private double totalFare;
//空参
    public ERyder() {
        this.bikeID = "DEFAULT_ID";
        this.batteryLevel = 100;
        this.isAvailable = true;
        this.kmDriven = 0.0;
        this.totalUsageInMinutes = 0;
        this.totalFare = 0.0;
        this.LINKED_ACCOUNT = "";
        this.LINKED_PHONE_NUMBER = 0;
    }

    public ERyder(String bikeID, int batteryLevel, boolean isAvailable, double kmDriven, String LINKED_ACCOUNT, long LINKED_PHONE_NUMBER, int totalUsageInMinutes, double totalFare) {
        this.bikeID = bikeID;
        this.isAvailable = isAvailable;
        this.kmDriven = kmDriven;
        setBatteryLevel(batteryLevel);
        this.LINKED_ACCOUNT = LINKED_ACCOUNT;
        this.LINKED_PHONE_NUMBER = LINKED_PHONE_NUMBER;
        this.totalUsageInMinutes = totalUsageInMinutes;
        this.totalFare = totalFare;

    }
//行为
    public void ride() {
        if (this.batteryLevel > 0 && this.isAvailable) {
            System.out.println("The bike is available.");
        } else {
            System.out.println("The bike is not available.");
        }
    }

    public void printBikeDetails() {
        System.out.println("Bike ID: " + this.bikeID);
        System.out.println("Battery Level: " + this.batteryLevel + "%");
        System.out.println("Availability: " + (this.isAvailable ? "Available" : "Not Available"));
        System.out.println("Distance Travelled: " + this.kmDriven + " km");
        System.out.println("Linked Account: " + this.LINKED_ACCOUNT);
        System.out.println("Linked Phone Number: " + this.LINKED_PHONE_NUMBER);
        System.out.println("Total Usage in Minutes: " + this.totalUsageInMinutes);
        System.out.println("Total Fare: " + this.totalFare);
    }
    public double calculateFare(int usagelnMinutes) {
        this.totalUsageInMinutes = usagelnMinutes;
        this.totalFare = BASE_FARE + ( usagelnMinutes * PER_MINUTE_FARE);
        return this.totalFare;
    }
//getter/setter
    public void setBikeID(String bikeID) {

        this.bikeID = bikeID;
    }

    public String getBikeID() {

        return bikeID;
    }

    public void setBatteryLevel(int batteryLevel) {
        if (batteryLevel >= 0 && batteryLevel <= 100) {
            this.batteryLevel = batteryLevel;
        } else {
            System.out.println("Error: Battery level must be 0-100! Set to default 100%.");
            this.batteryLevel = 100;

        }
    }

    public int getBatteryLevel() {

        return batteryLevel;
    }

    public void setAvailable(boolean available) {

        isAvailable = available;
    }

    public boolean isAvailable() {

        return isAvailable;
    }

    public void setKmDriven(double kmDriven) {

        this.kmDriven = kmDriven;
    }

    public double getKmDriven() {

        return kmDriven;
    }
    public String getLINKED_ACCOUNT() {
        return LINKED_ACCOUNT;
    }
    public long getLINKED_PHONE_NUMBER() {
        return LINKED_PHONE_NUMBER;
    }
    public int getTotalUsageInMinutes() {
        return totalUsageInMinutes;
    }
    public double getTotalFare() {
        return totalFare;
    }
}
