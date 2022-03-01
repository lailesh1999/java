import java.util.Scanner;

import java.util.*;

class account {
    double acc_no;
    String name;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account no:");
        acc_no = sc.nextDouble();
        System.out.print("Enter name:");
        name = sc.next();
    }

    void display() {
        System.out.println("ACCOUNT N0:" + acc_no);
        System.out.println("NAME:" + name);
    }
}

class FD extends account {
    double balance;

    void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Balance:");
        balance = sc.nextDouble();
    }

    void display() {
        super.display();
        System.out.println("BALANCE FD:" + balance);
    }
}

class SB extends account {
    double balance;

    void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Balance:");
        balance = sc.nextDouble();
    }

    void display() {
        super.display();
        System.out.println("BALANCE SB:" + balance);
    }
}

class current extends account {
    double balance;

    void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Balance:");
        balance = sc.nextDouble();
    }

    void display() {
        super.display();
        System.out.println("BALANCE current:" + balance);
    }
}

class longterm extends FD {
    int term;
    double rate;

    void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the interest:");
        rate = sc.nextDouble();
        System.out.println("Enter term:");
        term = sc.nextInt();
    }

    void display() {
        super.display();
        System.out.println("TERM:" + term);
        System.out.println("RATE:" + rate);
    }
}

class mediumterm extends FD {
    int term;
    double rate;

    void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the interest:");
        rate = sc.nextDouble();
        System.out.println("Enter term:");
        term = sc.nextInt();
    }

    void display() {
        super.display();
        System.out.println("TERM:" + term);
        System.out.println("RATE:" + rate);
    }
}

class shortterm extends FD {
    int term;
    double rate;

    void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the interest:");
        rate = sc.nextDouble();
        System.out.println("Enter term:");
        term = sc.nextInt();
    }

    void display() {
        super.display();
        System.out.println("TERM:" + term);
        System.out.println("RATE:" + rate);
    }
}

class hierarachiel_inheritance {
    public static void main(String args[]) {
        int ch, ch1;
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("1. SB");
        System.out.println("2. FD");
        System.out.println("3. Current");
        System.out.println("Enter your choice");
        ch = sc.nextInt();
        switch (ch) {
            case 1:
                SB s = new SB();
                s.input();
                s.display();
                break;
            case 2:
                System.out.println("MENU");
                System.out.println("1.long term ");
                System.out.println("2. medium term");
                System.out.println("3. short term:");
                System.out.println("Enter your choice");
                ch1 = sc.nextInt();
                switch (ch) {
                    case 1:
                        longterm l = new longterm();
                        l.input();
                        l.display();
                        break;
                    case 2:
                        mediumterm m = new mediumterm();
                        m.input();
                        m.display();
                        break;
                    case 3:
                        shortterm st = new shortterm();
                        st.input();
                        st.display();
                        break;

                }
                break;
            case 3:
                current c = new current();
                c.input();
                c.display();
                break;
            case 4:
                System.exit(0);
                System.out.println("DO YOU WANT TO CONTINUE y/n");
                String ans = sc.next();
        }
    }
}