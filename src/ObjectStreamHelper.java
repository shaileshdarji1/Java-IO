import java.io.*;

public class ObjectStreamHelper {
    final static String FILE="/home/shailesh/Documents/Java/Java IO/file/text2.txt";
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fos = new FileOutputStream(FILE);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Student s1 = new Student(101, "Shailesh", "LDCE");
        oos.writeObject(s1);
        oos.flush();
        oos.close();

        FileInputStream fin = new FileInputStream(FILE);
        ObjectInputStream ois = new ObjectInputStream(fin);
        Student s2 = (Student) ois.readObject();
        ois.close();
        fin.close();
        System.out.print(s2);
    }
}
