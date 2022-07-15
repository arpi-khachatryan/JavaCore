package classwork.fileExample.ioExamples;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataIOStream {
    private static final String FILE_PATH = "/Users/annakhachatryan/IdeaProjects/JavaCore/src/classwork/fileExample.txt/ioExamples/example.txt";

    public static void main(String[] args) throws IOException {
        write();
        read();
    }

    public static void write() throws IOException {
        DataOutputStream out = new DataOutputStream(new FileOutputStream(FILE_PATH));
        //DataOutputStream abstract կլաս է
        //տվյալ ենք պահում ֆայլի մեջ
        //FileOutputStream ցույց է տալիս ֆայլի տեղը
        out.writeInt(33);
        out.writeBoolean(false);
        //out.flush();
        out.close();
    }

    public static void read() throws IOException {
        DataInputStream inputStream = new DataInputStream(new FileInputStream(FILE_PATH));
        System.out.println(inputStream.readInt());
        System.out.println(inputStream.readBoolean());
        inputStream.close();
    }
}
