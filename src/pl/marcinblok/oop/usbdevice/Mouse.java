package pl.marcinblok.oop.usbdevice;

public class Mouse implements USBDevice{
    private String name;

    public Mouse(String name) {
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
