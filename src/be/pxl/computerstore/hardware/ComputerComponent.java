package be.pxl.computerstore.hardware;

import java.util.Random;

public class ComputerComponent {
    private String vendor;
    private String name;
    private double price;
    private String articleNumber;

    public ComputerComponent(String vendor, String name, double price) {
        this.vendor = vendor;
        this.name = name;
        this.price = price;
        createAndSetArticlenumber(vendor);

    }

    public void createAndSetArticlenumber(String vendor) {

        while (vendor.length() < 3) {
            vendor += "X";
        }

        this.articleNumber = vendor.substring(0, 3).toUpperCase();


        this.articleNumber += "-" + generateNumber();

    }

    private String generateNumber() {
        Random rand = new Random();
        int number = rand.nextInt(100000);
        String finalRandom = Integer.toString(number);

        while (finalRandom.length() < 5) {
            finalRandom = "0" + finalRandom;
        }
        return finalRandom;
    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + "(" + articleNumber + ")";
    }

    public void getFullDescription() {
        System.out.printf("articleNumber = %s %n Vendor = %s %n Name = %s %n Price = %.2f %n", this.articleNumber, this.vendor, this.name, this.price);
    }
}
