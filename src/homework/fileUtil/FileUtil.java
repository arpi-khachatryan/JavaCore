package homework.fileUtil;

import java.io.*;
import java.util.Scanner;

public class FileUtil {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        fileSearch();
        //contentSearch();
        //findLines();
        //printSizeOfPackage();
        //createFileWithContent();
    }

    static void fileSearch() {
        String path = scanner.nextLine();
        File myFolder = new File(path);        // /Users/annakhachatryan/IdeaProjects/JavaCore/src/homework/fileUtil/

        String fileName = scanner.nextLine(); // fileExample.txt

        if (myFolder.isDirectory()) {
            File[] files = myFolder.listFiles();
            for (File file : files) {
                if (file.getName().equals(fileName)) {
                    System.out.println("true");
                }
            }
        } else {
            System.out.println("File with that name does not exist");
        }
    }

    static void contentSearch() throws IOException {
        String path = scanner.nextLine();
        File folder = new File(path);
        String keyword = "to";
        File[] files = folder.listFiles();
        for (File file : files) {
            if (file.getName().contains(".txt")) {
                try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file.getPath()))) {
                    String line = "";
                    while ((line = bufferedReader.readLine()) != null) {
                        for (String s : line.split(" ")) {
                            if (s.equals(keyword)) {
                                System.out.println(file);
                            }
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static void findLines() throws IOException {
        String txtPath = scanner.nextLine(); // /Users/annakhachatryan/IdeaProjects/JavaCore/src/homework/fileUtil/fileExample.txt
        File path = new File(txtPath);
        String keyword = scanner.nextLine(); // mountainside
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                for (String s : line.split(" ")) {
                    if (s.equals(keyword)) {
                        System.out.println(line + " ");
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void printSizeOfPackage() throws IOException {
        String path = scanner.nextLine();
        File folder = new File(path);
        File[] files = folder.listFiles();
        long count = 0;
        for (File file : files) {
            count += file.getTotalSpace();
        }
        System.out.println(count);
    }

    static void createFileWithContent() throws IOException {
        String path = scanner.nextLine();
        File folder = new File(path);
        String fileName = scanner.nextLine(); //  /file.txt
        String content = scanner.nextLine();  //  the sky is blue
        String filePath = folder.getPath();
        filePath += fileName;
        File file = new File(filePath);
        if (!file.exists()) {
            file.createNewFile();
            System.out.println(file);
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            bufferedWriter.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line = " ";
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}