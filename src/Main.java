import java.io.*;
import java.util.Enumeration;
import java.util.TreeSet;
import java.util.Vector;

public class Main {
    final static String FILE1="/home/shailesh/Documents/Java/Java IO/file/text.txt";
    final static String FILE2="/home/shailesh/Documents/Java/Java IO/file/text1.txt";

    public static void main(String[] args) throws IOException {

        FileOutputStream fileOutputStream = new FileOutputStream(FILE1);
        String name = "Shailesh\t";
        byte b[] = name.getBytes();
        fileOutputStream.write(b);
        fileOutputStream.flush();
        fileOutputStream.close();
        System.out.println("Data added sucessfully!");

        FileInputStream fileInputStream = new FileInputStream(FILE1);
        int i = 0;
        while ((i = fileInputStream.read()) != -1) {
            System.out.print((char) i);
        }
        System.out.println("");

        FileOutputStream fos = new FileOutputStream(FILE2);
        BufferedOutputStream bout = new BufferedOutputStream(fos);
        String name1 = "College Name:LD College of Engineering";
        String name2 = "\tEnrollment no:190280107029";
        byte n[] = name2.getBytes();
        byte c[] = name1.getBytes();
        bout.write(c);
        bout.write(n);
        bout.flush();
        bout.close();
        fos.close();
        System.out.println("Data added sucessfully!");

        FileInputStream fis = new FileInputStream(FILE2);
        int j = 0;
        while ((j = fis.read()) != -1) {
            System.out.print((char) j);
        }
        System.out.println("");
        FileInputStream fileInputStream1 = new FileInputStream(FILE1);
        FileInputStream fileInputStream2 = new FileInputStream(FILE2);

        Vector v = new Vector<>();
        v.add(fileInputStream1);
        v.add(fileInputStream2);

        Enumeration e = v.elements();

        SequenceInputStream sis = new SequenceInputStream(e);
        int z = 0;
        while ((z = sis.read()) != -1) {
            System.out.print((char) z);
        }
    }
}
