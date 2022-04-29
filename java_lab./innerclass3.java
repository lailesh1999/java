class outerclass {
    int j = 10;

    void display() {
        class innerClass {
            int i = 5;

            void display() {
                System.out.print("INNER CLASS>>>");
                System.out.print(j++ + "\t");
                System.out.println(i++ + "\t");
            }
        }
        innerClass c1 = new innerClass();
        c1.display();
        System.out.print("OUTER CLASS>>>");
        System.out.print(j + "\t");
        System.out.print(c1.i + "\t");
    }
}

class innerclass3 {
    public static void main(String[] args) {
        outerclass c2 = new outerclass();
        c2.display();
    }
}