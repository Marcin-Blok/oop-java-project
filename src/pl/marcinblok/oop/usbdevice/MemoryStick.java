package pl.marcinblok.oop.usbdevice;

public class MemoryStick implements USBDevice{
    private String name;
    private boolean ejected = false;

    public MemoryStick(String name) {
        this.name = name;
    }


    @Override
    public boolean connect() {
        System.out.println("Memory Stick Connected");
        return true;
    }

    @Override
        public boolean disconnect() {
            if (!ejected) {
                System.out.println("Please eject Memory Stick first");
                return false;
            } else {
                System.out.println("Memory Stick disconnected");
                return true;
            }
    }

    @Override
    public String getName() {
        return "Memory Stick: " + name;
    }

    public void eject() {
        System.out.println("Ejecting Memory Stick");
        ejected = true;
    }

}
