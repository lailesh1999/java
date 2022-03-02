import java.util.Scanner;

class Figure {
    int len, breath;

    Figure(int len, int breath) {
        this.breath = breath;
        this.len = len;
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        breath = sc.nextInt();
        len = sc.nextInt();
    }

    void area() {
        System.out.println("AREA IS NOT DEFINED");
    }
}

class Rectange extends Figure {
    Rectange(int len, int breath) {
        super(len, breath);
    }

    void area() {
        int area = len * breath;
        System.out.println("Area of rectangle:" + area);
    }
}

class Triangle extends Figure {
    Triangle(int len, int breath) {
        super(len, breath);
    }

    void area() {
        double area = 0.5 * breath * len;
        System.out.println("AREA OF TRIANGLE:" + area);
    }
}

public class example_demo {
    public static void main(String[] args) {
        Figure f = new Figure(2, 4);
        Rectange r = new Rectange(4, 2);
        r.area();
        Triangle t = new Triangle(4, 5);
        t.area();
        f = new Rectange(10, 20);
        f.input();
        f.area();
        f = new Triangle(12, 45);
        f.input();
        f.area();
    }
}