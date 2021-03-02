package pl.marcinblok.oop;

import pl.marcinblok.oop.drive.SSDDrive;
import pl.marcinblok.oop.file.imagefile.GIFImageFile;
import pl.marcinblok.oop.file.imagefile.JPGImageFile;
import pl.marcinblok.oop.usbdevice.MemoryStick;
import pl.marcinblok.oop.usbdevice.Mouse;
import pl.marcinblok.oop.usbdevice.USBDevice;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Computer computer = new Computer(new Monitor(), new SSDDrive());
        System.out.println("Adding components to the computer:");
        computer.addUSBDevice(new MemoryStick("Porsche Design"));
        computer.addUSBDevice(new Mouse("Logitech"));
        computer.setHeadphones(new Headphones("Denon"));
        System.out.println("Headphones brand: " + computer.getHeadphones().getBrand() + "\n");
        System.out.print("Setting screen resolution: ");
        computer.getMonitor().setHighResolution();
        System.out.println("Screen resolution set to: " + computer.getMonitor().getResolution() + "\n");

        List<USBDevice> usbDevices = computer.getUsbDevices();
        System.out.println("USB deveices list:");
        for (USBDevice usbdeviece : usbDevices) {
            System.out.println(usbdeviece.getName());
        }

        GIFImageFile GIFImageFile = new GIFImageFile("Funniest Ever GiF :)", 300);
        computer.getDrive().addFile(GIFImageFile);
        computer.getDrive().addFile(new JPGImageFile("New York City Wallpaper HD!", 450, 100));
        System.out.println("\n" + "Displaying saved files:");
        computer.getDrive().listFiles();

    }
}
