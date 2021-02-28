package pl.marcinblok.oop.drive;

import java.util.ArrayList;
import java.util.List;

public class HDDDrive implements Drive{
    private List<File> files = new ArrayList<>();

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
