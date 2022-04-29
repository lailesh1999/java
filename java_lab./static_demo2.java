class car {
    static int count = 0;
    int id = 0;

    car() {
        count++;
        id++;
    }

    static void showStatic() {
        System.out.println("STATIC VARIBALE::" + count);
    }

    static {
        System.out.println("THIS IS STATIC BLOCK>>>>::");
    }

    void show() {
        System.out.println("NORMAL BLOCK ID::" + id);
    }
}

class static_demo2 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            car c1 = new car();
            car.showStatic();
            c1.show();
        }

    }
}