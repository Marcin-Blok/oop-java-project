package pl.marcinblok.oop.drive;


import pl.marcinblok.oop.file.File;

public interface Drive {
    void addFile(File file);
    void listFiles();
    File findFile(String name);
}
