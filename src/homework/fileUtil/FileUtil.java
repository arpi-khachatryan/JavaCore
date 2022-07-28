package homework.fileUtil;

import java.io.*;
import java.util.Scanner;

public class FileUtil {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //fileSearch();
        //contentSearch();
        //findLines();
        //printSizeOfPackage();
        //createFileWithContent();
    }

    static void fileSearch() {
        String path = scanner.nextLine();
        String fileName = scanner.nextLine();
        recursiveFileSearch(path, fileName);
    }

    static void recursiveFileSearch(String path, String fileName) {
        File myFolder = new File(path);
        if (myFolder.isDirectory()) {
            File[] files = myFolder.listFiles();
            for (File file : files) {
                if (file.isFile()) {
                    if (file.getName().equals(fileName)) {
                        System.out.println(myFolder.getName() + " " + true);
                        break;
                    } else {
                        if (file.isDirectory()) {
                            recursiveFileSearch(file.getPath(), fileName);
                        }
                    }
                } else {
                    System.out.println("File not found");
                }
            }
        } else {
            System.out.println("File with that name does not exist");
        }
    }

    //or-second option
    static void fileSearch2() {
        String path = scanner.nextLine();
        String fileName = scanner.nextLine();
        File file = new File(path, fileName);
        System.out.println(file.exists());
    }

    static void contentSearch() throws IOException {
        String path = scanner.nextLine();
        String keyword = scanner.nextLine();
        File folder = new File(path);
        if (folder.exists() && folder.isDirectory()) {
            File[] files = folder.listFiles();
            for (File file : files) {
                if (file.getName().endsWith(".txt")) {
                    try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file.getPath()))) {
                        String line = "";
                        while ((line = bufferedReader.readLine()) != null) {
                            if (line.contains(keyword)) {
                                System.out.println(file.getName());
                                break;
                            }
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        } else {
            System.out.println("Folder not found");
        }
    }

    //or-second option
    static void contentSearch2() {
        String path = scanner.nextLine();
        String keyword = scanner.nextLine();
        File folder = new File(path);
        if (folder.exists() && folder.isDirectory()) {
            File[] files = folder.listFiles(new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    return pathname.getName().endsWith(".txt");
                }
            });
            for (File file : files) {
                try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
                    String line = "";
                    while ((line = bufferedReader.readLine()) != null) {
                        if (line.contains(keyword)) {
                            System.out.println(file.getAbsolutePath());
                            break;
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else {
            System.out.println("Folder not found");
        }
    }

    //or-third option
    static void contentSearch3() {
        String path = scanner.nextLine();
        String keyword = scanner.nextLine();
        findFile(path, keyword);
    }

    private static void findFile(String path, String keyword) {
        File folder = new File(path);
        if (folder.exists() && folder.isDirectory()) {
            File[] files = folder.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        findFile(file.getAbsolutePath(), keyword);
                    } else {
                        if (file.getName().endsWith(".txt")) {
                            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
                                String line = "";
                                while ((line = bufferedReader.readLine()) != null) {
                                    if (line.contains(keyword)) {
                                        System.out.println(file.getAbsolutePath());
                                        break;
                                    }
                                }
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            } else {
                System.out.println("Folder not found");
            }
        } else {
            System.out.println("Folder not found");
        }
    }

    static void findLines() throws IOException {
        String txtPath = scanner.nextLine();
        String keyword = scanner.nextLine();
        File file = new File(txtPath);
        if (file.exists() && file.isFile() && file.getName().endsWith(".txt")) {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
                String line = "";
                int size = 0;
                while ((line = bufferedReader.readLine()) != null) {
                    ++size;
                    if (line.contains(keyword)) {
                        line = line.replaceAll(keyword, "\u001B[33m" + keyword + "\u001B[0m");
                        System.out.println("Line " + size + ": " + line);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    static void printSizeOfPackage() throws IOException {
        String path = scanner.nextLine();
        File folder = new File(path);
        if (folder.exists() && folder.isDirectory()) {
            File[] files = folder.listFiles();
            long fileSize = 0;
            for (File file : files) {
                fileSize += file.length();
            }
            System.out.println(fileSize / (1024 * 1024) + " mb");
        }
    }

    static void createFileWithContent() throws IOException {
        String path = scanner.nextLine();
        String fileName = scanner.nextLine();
        String content = scanner.nextLine();
        File folder = new File(path);
        if (folder.exists()) {
            fileName = fileName.endsWith(".txt") ? fileName : fileName + ".txt";
            File file = new File(path, fileName);
            if (!file.exists()) {
                file.createNewFile();
                System.out.println(file);
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
            } else {
                System.out.println("A file with that name already exists");
            }
        }
    }
}