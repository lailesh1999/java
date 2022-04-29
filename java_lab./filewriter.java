import java.io.*;

public class filewriter {
    public static void main(String[] args) {
        try {
            String str = "HELLO WORLD THIS IS LAILESH VEIGAS";
            FileWriter fw = new FileWriter("text1.txt");
            BufferedWriter bf = new BufferedWriter(fw);
            bf.write(str);
            bf.close();
            FileReader rs = new FileReader("text1.txt");
            BufferedReader bs = new BufferedReader(rs);
            int i;
            while ((i = bs.read()) != -1) {
                System.out.print((char) i);

            }
            bs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
