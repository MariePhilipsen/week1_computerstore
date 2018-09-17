package be.pxl.computerstore;

import be.pxl.computerstore.hardware.ComputerCase;
import be.pxl.computerstore.hardware.Processor;

public class TestApp {

    public static void main(String[] args) {

        ComputerCase computer1 = new ComputerCase("H", "Pavilon", 3434.45);
        System.out.println(computer1);

        Processor processor1 = new Processor("H", "Intel", 2322.33, 0.4);
        System.out.println(processor1);
    }


}
