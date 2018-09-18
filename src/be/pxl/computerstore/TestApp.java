package be.pxl.computerstore;

import be.pxl.computerstore.hardware.*;
import be.pxl.computerstore.util.Dimension;

public class TestApp {

    public static void main(String[] args) {

        ComputerCase computer1 = new ComputerCase("H", "Pavilon", 3434.45);
        System.out.println(computer1);
        System.out.println();

        Processor processor1 = new Processor("H", "Intel", 2322.33, 0.4);
        System.out.println(processor1);
        System.out.println();

        computer1.setDimension(new Dimension(10, 20, 20));

        computer1.getFullDescription();
        System.out.println();

        processor1.getFullDescription();
        System.out.println();

        Mouse muis = new Mouse("TS", "X100", 77.5);
        System.out.println(muis);
        System.out.println();

        Monitor monitor = new Monitor("HPI", "V-Line 2000", 200.22);
        System.out.println(monitor);
        System.out.println();

        Keyboard keyboard1 = new Keyboard("AAA", "BBB", 44, KeyboardLayout.AZERTY);
        System.out.println(keyboard1);
    }


}
