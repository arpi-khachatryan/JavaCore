package classwork.fileExample.testFolder;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Date;

public class FileExample {
    static String filePath = "/Users/annakhachatryan/IdeaProjects/JavaCore/src/classwork/fileExample/testFolder/hello.txt";
    static String newFilePath = "/Users/annakhachatryan/IdeaProjects/JavaCore/src/classwork/fileExample.txt/testFolder/hello3.txt";

    public static void main(String[] args) throws IOException {
        File myFile = new File(filePath);
        System.out.println(myFile.exists());
        System.out.println(myFile.exists());

        String separator = File.separator;// path-ը գրելու համար

        myFile.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".txt");
            }
        });

        if (!myFile.exists()) {
            myFile.createNewFile();
            System.out.println(myFile.exists());
        }

        System.out.println("isFile: " + myFile.isFile());
        System.out.println("isDirectory: " + myFile.isDirectory());
        if (myFile.isDirectory()) {
            File[] files = myFile.listFiles();
            for (File file : files) {
                if (file.isDirectory()) {
                    System.out.print(file.getName() + " ");
                }
            }
        }
        System.out.println(myFile.canWrite());

        File parentFile = myFile.getParentFile();
        System.out.println(parentFile);

        System.out.println(myFile.getTotalSpace());
        System.out.println(myFile.getUsableSpace());
        System.out.println(myFile.getFreeSpace());
        System.out.println(myFile.isHidden());
        System.out.println(myFile.lastModified());
        System.out.println(myFile.toString());

        Date date = new Date(myFile.lastModified());
        System.out.println(date);
    }
}