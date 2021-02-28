package pl.marcinblok.oop.drive;

import java.util.HashMap;
import java.util.Map;

public class SDDDrive implements Drive{
    private Map<String, File> files = new HashMap<>();


    @Override
    public void addFile(File file) {

    }

    @Override
    public void listFiles() {

    }

    @Override
    public File findFile(String name) {
        return null;
    }
}
