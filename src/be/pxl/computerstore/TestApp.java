package be.pxl.computerstore;

import be.pxl.computerstore.hardware.ComputerCase;
import be.pxl.computerstore.hardware.Processor;
import be.pxl.computerstore.util.Dimension;

public class TestApp {

    public static void main(String[] args) {

        ComputerCase computer1 = new ComputerCase("H", "Pavilon", 3434.45);
        System.out.println(computer1);

        Processor processor1 = new Processor("H", "Intel", 2322.33, 0.4);
        System.out.println(processor1);

        computer1.setDimension(new Dimension(10, 20, 20));

        computer1.getFullDescription();

        processor1.getFullDescription();
    }


}
