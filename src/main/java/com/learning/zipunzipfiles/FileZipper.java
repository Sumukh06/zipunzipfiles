package com.learning.zipunzipfiles;

import net.lingala.zip4j.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class FileZipper {

    public void compressFile() throws ZipException {
        ZipFile zipFile = new ZipFile("compressed.zip");
        zipFile.addFile(new File("src/main/resources/data/File1.txt"));
    }

    public static void main(String[] args) throws ZipException {
        ZipFile zipFile = new ZipFile("src/main/resources/data/compressed.zip");
        zipFile.addFile("src/main/resources/data/File1.txt");
        zipFile.addFile("src/main/resources/data/File2.txt");

        zipFile.extractAll("src/main/resources/data/unzipped/");
    }

}
