package pl.marcinblok.oop.usbdevice;

public interface USBDevice {
    boolean connect();
    boolean disconnect();
    String getName();
}
