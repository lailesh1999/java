class outerClass {
    static int i = 30;

    static class innerClass {
        int j = 40;

        void display() {
            System.out.println(++i + "\t");
            System.out.println(++j + "\t");

        }
    }

}

class inner {
    public static void main(String[] args) {
        outerClass.innerClass c1 = new outerClass.innerClass();
        c1.display();
    }
}