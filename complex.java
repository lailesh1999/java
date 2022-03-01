import java.util.*;

class complex_obj {
    int real, img;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE REAL PART:");
        real = sc.nextInt();
        System.out.print("Enter the img part:");
        img = sc.nextInt();
    }

    void display() {
        if (img > 0) {
            System.out.println(+real + "+" + img + "i");

        } else {
            System.out.println(+real + "" + img + "i");
        }
    }

    complex_obj add(complex_obj c4) {
        complex_obj temp = new complex_obj();
        temp.real = real + c4.real;
        temp.img = img + c4.img;
        return temp;
    }

    void sub(complex_obj c) {
        int i, r;
        i = img - c.img;
        r = real - c.real;

        if (i > 0) {
            System.out.println(+r + "+" + i + "i");
        } else {
            System.out.println(+r + " " + i + "i");
        }
    }
}

class complex {
    public static void main(String args[]) {
        complex_obj c1 = new complex_obj();
        c1.input();
        c1.display();
        complex_obj c2 = new complex_obj();
        c2.input();
        c2.display();
        complex_obj c3 = new complex_obj();
        c3 = c1.add(c2);
        c3.display();

        c3.sub(c2);

    }
}