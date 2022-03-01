import java.util.*;

interface demo1 {
    String name = "lailesh";
    String course = "mca";
    int reg_no = 2117031;

    public int add(int x, int y);

    public void display();
    // public void display2();

}

class student implements demo1 {
    public void display() {
        System.out.println("name" + name + "COURSE:" + course + "REG_NO:" + reg_no);
    }

    public int add(int a, int b) {
        return a + b;
    }

}

class interface_demo {
    public static void main(String args[]) {
        student st = new student();
        st.display();

        int y = st.add(40, 50);
        System.out.println(y);
    }
}