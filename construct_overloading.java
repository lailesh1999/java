class book {
    String title, author, subject;
    int price, edition;

    book() {
        title = "";
        author = "";
        subject = "";
        price = 0;
        edition = 0;
    }

    book(String t, String a, String s, int p, int e) {
        title = t;
        author = a;
        subject = s;
        price = p;
        edition = e;
    }

    void display() {
        System.out.println("Title:" + title);
        System.out.println("Author:" + author);
        System.out.println("Subject" + subject);
        System.out.println("Price:" + price);
        System.out.println("edition" + edition);
    }
}

class construct_overloading {
    public static void main(String args[]) {
        book b = new book("java", "ABC", "java advance", 200, 278);
        b.display();
        book b1 = new book("python", "xyz", "python advance", 2040, 1278);
        b1.display();
    }

}
