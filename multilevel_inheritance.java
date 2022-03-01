import java.util.*;

class student {
    int reg_no;
    String name;
    int age;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter reg_no no:");
        reg_no = sc.nextInt();
        System.out.print("Enter name:");
        name = sc.next();
        System.out.print("Enter age:");
        age = sc.nextInt();
    }

    void display() {
        System.out.println("REG NO:" + reg_no);
        System.out.println("NAME:" + name);
        System.out.println("AGE:" + age);
    }
}

class mark extends student {
    int marks[] = new int[3];
    int i;
    Scanner sc = new Scanner(System.in);

    void input() {
        super.input();
        int c = 0;
        for (i = 0; i < 3; i++) {
            c += 1;
            System.out.println("ENTER THE MARKS" + c + ":");
            marks[i] = sc.nextInt();
        }

    }

    void display() {
        super.display();
        int i;
        int c = 0;
        for (i = 0; i < 3; i++) {
            c += 1;
            System.out.println(" MARKS IN SUBJECT" + c + ":" + marks[i]);
        }
    }
}

class result extends mark {
    int total;

    void display() {
        super.display();
        total = 0;
        for (int i = 0; i < 3; i++) {
            total = total + marks[i];
        }
        System.out.println("TOTAL MARKS:" + total);
    }

}

class multilevel_inheritance {
    public static void main(String args[]) {
        result rs = new result();
        rs.input();
        rs.display();

    }
}
