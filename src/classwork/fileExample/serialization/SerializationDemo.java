package classwork.fileExample.serialization;

import java.io.*;

public class SerializationDemo {
    public static final String FILE_PATH = "/Users/annakhachatryan/IdeaProjects/JavaCore/src/classwork/fileExample.txt/serialization/file/example.txt";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student = new Student("poghos", "poghosyan", 18, "poghos@gmail.com");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
        objectOutputStream.writeObject(student);
        objectOutputStream.close();

//        ObjectInputStream objectInputStreamputStream = new ObjectInputStream(new FileInputStream(FILE_PATH));
//        Object object = objectInputStreamputStream.readObject();
//        Student student = (Student) object;
//        System.out.println(student);
    }
}
