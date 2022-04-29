import java.io.*;

public class ObjectReadWrite {
    public static void main(String[] args) {
        String str = "hello hiiiii";
        int phone = 99622;
        try {
            FileOutputStream fo = new FileOutputStream("object.txt");
            ObjectOutputStream os = new ObjectOutputStream(fo);
            os.writeObject(str);
            os.writeInt(phone);
            os.close();
            FileInputStream fs = new FileInputStream("object.txt");
            ObjectInputStream s = new ObjectInputStream(fs);
            System.out.println(s.readObject());
            System.out.println(s.readInt());
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
