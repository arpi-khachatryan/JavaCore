package homework.fileUtil;

import java.io.*;
import java.util.Scanner;

public class FileUtil {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        fileSearch();            //1
        //contentSearch();         //2
        //findLines();             //3
        //printSizeOfPackage();    //4
        //createFileWithContent(); //5
    }

    //1
    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - fileName - ֆայլի անունը, որը փնտրում ենք։
    //Որպես արդյունք պտի ծրագիրը տպի true եթե կա էդ ֆայլը էդ պապկի մեջ, false եթե չկա։
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

    //2
    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - keyword - ինչ որ բառ
    // Մեթոդը պետք է նշված path-ում գտնի բոլոր .txt ֆայլերը, և իրենց մեջ փնտրի
    // մեր տված keyword-ը, եթե գտնի, պետք է տպի տվյալ ֆայլի անունը։
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

    //3
    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - txtPath txt ֆայլի փաթը
    // 2 - keyword - ինչ որ բառ
    // տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառը։
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

    //4
    //այս մեթոդը պետք է սքաններով վերցնի մեկ string.
    // 1 - path թե որ ֆոլդերի չափն ենք ուզում հաշվել
    // ֆոլդերի բոլոր ֆայլերի չափսերը գումարում ենք իրար, ու տպում
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

    //5
    //այս մեթոդը պետք է սքաններով վերցնի երեք string.
    // 1 - path պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը
    // 2 - fileName ֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու
    // 3 - content ֆայլի պարունակությունը։ Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու
    // որպես արդյունք պապկի մեջ սարքելու է նոր ֆայլ, իրա մեջ էլ լինելու է content-ով տվածը
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