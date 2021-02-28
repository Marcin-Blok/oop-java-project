package pl.marcinblok.oop.file.imagefile;

public class GITImageFile extends AbstractImageFile{
    public GITImageFile(String name, int size) {
        super(name, size);
    }

    public void showAnimation(){
        System.out.println("Showing funny GIF");
    }

    public int getVersion(){
        return 2;
    }
}
