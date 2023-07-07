package classwork.fileExample.nioExample;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class NIOExample {

    public static void main(String[] args) throws IOException {

        File myFile = new File("/Users/annakhachatryan/IdeaProjects/JavaCore/src/classwork/fileExample/nioExample/myFile.txt");
        try {
            boolean fileCreated = myFile.createNewFile();
            System.out.println(fileCreated);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        FilenameFilter filter = (file, fileName) -> {
            return fileName.contains(".");
        };

        //The dot "." represents the current working directory.
        //The list() method returns an array of strings, representing the names of the files and directories in the current directory.
        //String[] contents = new File(".").list();
        String[] contents = new File(".").list(filter);
        for (String file : contents) {
            System.out.println(file);
        }

        new File("myDirectory").mkdir();

        //delete, copy, move - Path interface
        Path path = Paths.get("/Users/annakhachatryan/IdeaProjects/JavaCore/src/classwork/fileExample/nioExample/myFile.txt");
        try {
            Files.deleteIfExists(path);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        Path path1 = Paths.get("/Users/annakhachatryan/IdeaProjects/JavaCore/src/classwork/fileExample/nioExample/myFile.txt");
        System.out.println(path1.getParent());
        System.out.println(path1.getRoot());
        System.out.println(path1.getFileName());


        Path source = Paths.get("/Users/annakhachatryan/IdeaProjects/JavaCore/src/classwork/fileExample/nioExample/myFile.txt");
        Path dest = Paths.get("/Users/annakhachatryan/IdeaProjects/JavaCore/src/classwork/fileExample/nioExample/newFile.txt");
        try {
            Files.copy(source, dest, REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
