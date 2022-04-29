import java.io.*;

public class filecopy {

    public static void main(String[] args) {
        try {

            FileReader rs = new FileReader("text1.txt");
            BufferedReader bs = new BufferedReader(rs);
            FileWriter fb = new FileWriter("text3.txt");
            BufferedWriter bw = new BufferedWriter(fb);
            int i;
            while ((i = bs.read()) != -1) {
                bw.write((char) i);
            }
            bw.close();
            bs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
