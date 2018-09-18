package be.pxl.computerstore.hardware;

import be.pxl.computerstore.util.Dimension;

public class ComputerCase extends ComputerComponent {

    private Dimension dimension;
    private double weight;

    public ComputerCase(String vendor, String name, double price) {
        super(vendor, name, price);
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString() + "ComputerCase{" +
                "dimension=" + dimension +
                ", weight=" + weight +
                '}';
    }

    public void getFullDescription() {
        super.getFullDescription();
        System.out.printf("width = %d %n height = %d %n Depth = %d %n Weight = %.2f %n",
                dimension.getWidth(), dimension.getHeight(), dimension.getDepth(), weight);
    }


}
