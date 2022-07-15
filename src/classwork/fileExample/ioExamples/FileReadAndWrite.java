package classwork.fileExample.ioExamples;

import java.io.*;

public class FileReadAndWrite {
    private static final String FILE_PATH = "//Users/annakhachatryan/IdeaProjects/JavaCore/src/classwork/fileExample.txt/ioExamples/example2.txt";

    public static void main(String[] args) throws IOException {
        write();
        read();
    }

    public static void write() throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
            bw.write("Hello from Java \r\n");
            bw.write("Hello from Java!!! \r\n");
        }
    }

    public static void read() throws IOException {
        try (BufferedReader inputStream = new BufferedReader(new FileReader(FILE_PATH))) {
//            String line = "";
//            տող առ տող է կարդում
//            while((line =inputStream.readLine())!=null){
//                System.out.println(line);
//            }
            int c;
            int aCount = 0;
            while ((c = inputStream.read()) != -1) {
                char ch = (char) c;
                if (ch == 'a') {
                    ++aCount;
                }
                System.out.print(ch);
            }
            System.out.println(aCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
