class cal {
    void area(int a) {
        System.out.println("AREA OF SQUARE:" + a * a);
    }

    void area(double l, double b) {
        System.out.println("AREA OF RECTANGLE:" + l * b);
    }

    void area(float b, float h) {
        System.out.println("AREA OF TRIANGLE:" + 0.5 * b * h);
    }
}

class method_overloading {

    public static void main(String args[]) {

        cal c1 = new cal();
        c1.area(2);
        c1.area(200, 400);
        c1.area(2.5, 2.6);

    }
}