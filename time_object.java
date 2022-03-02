import java.util.Scanner;

class time {
    int hrs, min, sec;

    time() {
        hrs = 10;
        min = 20;
        sec = 40;

    }

    time(int h, int m, int s) {
        hrs = h;
        min = m;
        sec = s;
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  HR MIN SEC");
        hrs = sc.nextInt();
        min = sc.nextInt();
        sec = sc.nextInt();
    }

    time add(time tt) {
        int hr = hrs + tt.hrs;
        int mi = min + tt.min;
        int se = sec + tt.sec;
        if (se > 60) {
            min++;
            se = se - 60;
        }
        if (hr > 60) {
            hr++;
            mi = mi - 60;
        }
        time td = new time(hr, mi, se);
        return td;
    }

    void display() {
        System.out.println("HOURS:" + hrs);
        System.out.println("MIN:" + min);
        System.out.println("SEC:" + sec);
    }
}

class time_object {
    public static void main(String args[]) {
        time t1 = new time();
        t1.display();
        time t2 = new time(30, 40, 60);
        t2.display();
        time t3 = new time();
        t3.input();
        System.out.println("BEFORE ADDING:");
        t3.display();
        t3 = t1.add(t2);
        System.out.println("AFTER ADDING:");
        t3.display();

    }
}