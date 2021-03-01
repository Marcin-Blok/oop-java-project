package pl.marcinblok.oop.file.imagefile;

import pl.marcinblok.oop.file.AbstractFile;
import pl.marcinblok.oop.file.FileType;

public abstract class AbstractImageFile extends AbstractFile {

    protected AbstractImageFile(String name, int size) {
        super(name, size);
    }

    @Override
    public FileType getType() {
        return FileType.IMAGE;
    }
}
