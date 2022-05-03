
class gen<A> {
    A a;

    gen(A a) {
        this.a = a;
    }

    A display() {
        return a;
    }
}

class genericclass {
    public static void main(String[] args) {
        gen<Integer> g1 = new gen<Integer>(1);
        System.out.println("INTEGER :" + g1.display());
        gen<String> g2 = new gen<String>("HELLO WORLD");
        System.out.println("STRING :" + g2.display());

    }
}