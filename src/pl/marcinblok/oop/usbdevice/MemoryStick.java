package pl.marcinblok.oop.usbdevice;

public class MemoryStick implements USBDevice{
    private String name;
    private boolean ejected = false;

    public MemoryStick(String name) {
        this.name = name;
    }


    @Override
    public boolean connect() {
        return false;
    }

    @Override
    public boolean disconnect() {
        return false;
    }

    @Override
    public String getName() {
        return null;
    }
}
