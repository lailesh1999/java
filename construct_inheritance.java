class box {
    int length, breath;

    box(int length, int breath) {
        this.breath = breath;
        this.length = length;
    }

    int area() {
        return length * breath;
    }
}

class box1 extends box {
    int height;

    box1(int height, int breath, int length) {
        super(breath, length);
        this.height = height;
    }

    int volume() {
        return length * breath * height;
    }
}

class construct_inheritance {
    public static void main(String args[]) {
        box1 b1 = new box1(4, 4, 2);
        int area = b1.area();
        int volume = b1.volume();
        System.out.println("AREA OF BOX:" + area);
        System.out.print("VOLUME OF BOX1:" + volume);
    }
}