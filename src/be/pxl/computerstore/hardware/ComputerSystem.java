package be.pxl.computerstore.hardware;

public class ComputerSystem {

    private Processor processor;
    private HardDisk hardDisk;
    private ComputerCase computerCase;
    private Peripheral[] peripherals = new Peripheral[MAX_PHERIPHERAL];
    public static final int MAX_PHERIPHERAL = 3;


    public ComputerSystem() {

    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public ComputerCase getComputerCase() {
        return computerCase;
    }

    public void setComputerCase(ComputerCase computerCase) {
        this.computerCase = computerCase;
    }

    public void addPeripheral(Peripheral peripheral) throws TooManyPeripheralsException {
        if (peripheral == null) {
            return;
        }

        if (!isPresent(peripheral)) {
            if (getFreeLocation() != -1) {
                peripherals[getFreeLocation()] = peripheral;
            } else {
                throw new TooManyPeripheralsException("You've reached the limit of peripherals");
            }
        }
    }

    private boolean isPresent(Peripheral p) {
        for (int i = 0; i < peripherals.length; i++) {
            if (p.equals(peripherals[i])) {
                return true;
            }
        }
        return false;
    }

    private int getFreeLocation() {
        for (int i = 0; i < peripherals.length; i++) {
            if (peripherals[i] == null) {
                return i;
            }
        }
        return -1;
    }

    private int getNumberOfPheripherals() {
        int counter = 0;
        for (int i = 0; i < peripherals.length; i++) {
            if (peripherals[i] != null) {
                counter++;
            }
        }
        return counter;
    }
}