package chapters.chapter13;

import java.io.*;

public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;
        if (args.length != 1) {
            return;
        }
        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("հնարավոր չէ բացել ֆայլը");
            return;
        }
        try {
            do {
                i = fin.read();
                if (i != -1) {
                    System.out.println((char) i);
                }
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("սխալ կապված ֆայլից կարդալու հետ");
        }
        try {
            fin.close();
        } catch (IOException e) {
            System.out.println("սխալ կապված ֆայլի փակման հետ");
        }
    }
}

