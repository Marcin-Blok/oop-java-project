package pl.marcinblok.oop.drive;


public interface Drive {
    void addFile(File file);
    void listFiles();
    File findFile(String name);
}
