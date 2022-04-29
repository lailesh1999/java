import java.util.Scanner;

class Distance {
    double feet, inches;

    Distance() {
        feet = 0;
        inches = 0;
    }

    Distance(Double feet, Double inches) {
        this.feet = feet;
        this.inches = inches;
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE FEET");
        feet = sc.nextDouble();
        System.out.println("ENTER THE INCHES");
        inches = sc.nextDouble();

    }

    void display() {
        System.out.println("FEET :" + feet);
        System.out.println("INCHES :" + inches);
    }

    Distance add(Distance dd) {

        Double ft = dd.feet + feet;
        Double inc = dd.inches + inches;
        if (inc > 11) {
            inc = inc - 12;
            ft++;
        }
        Distance temp = new Distance(ft, inc);
        return temp;

    }

}

class DistanceArray1 {
    public static void main(String[] args) {

        Distance d1[] = new Distance[2];
        Distance total = new Distance();
        double feet1 = 0;
        for (int i = 0; i < d1.length; i++) {
            d1[i] = new Distance();
            d1[i].input();
            total = total.add(d1[i]);
            // not included optinal one
            feet1 = feet1 + d1[i].feet;
        }
        total.display();
        System.out.println("SIMPLE TOTAL" + feet1);

    }
}