package homework.fileUtil;

import java.io.*;
import java.util.Scanner;

public class FileUtil {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        fileSearch();
        contentSearch();
        findLines();
        printSizeOfPackage();
        createFileWithContent();
    }

    static void fileSearch() {
        String path = scanner.nextLine();
        File myFolder = new File(path);
        String fileName = scanner.nextLine();
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
        String keyword = scanner.nextLine();
        File[] files = folder.listFiles();
        for (File file : files) {
            if (file.getName().endsWith(".txt")) {
                try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file.getPath()))) {
                    String line = "";
                    while ((line = bufferedReader.readLine()) != null) {
                        for (String s : line.split(" ")) {
                            if (s.equals(keyword)) {
                                System.out.println(file.getName());
                                break;
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
        String txtPath = scanner.nextLine();
        File path = new File(txtPath);
        String keyword = scanner.nextLine();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = "";
            int size = 0;
            while ((line = bufferedReader.readLine()) != null) {
                ++size;
                if (line.contains(keyword)) {
                    System.out.println("Line " + size + ": " + line);
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
        long fileSize = 0;
        for (File file : files) {
            fileSize += file.length();
        }
        System.out.println(fileSize / 1024);
    }

    static void createFileWithContent() throws IOException {
        String path = scanner.nextLine();
        File folder = new File(path);
        String fileName = scanner.nextLine();
        String content = scanner.nextLine();
        String filePath = folder.getPath();
        filePath += "/" + fileName;
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