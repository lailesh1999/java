public class Commandline {
    public static void main(String[] args) {
        try {
            int count = 0, total = 0;
            for (int i = 0; i < args.length; i++) {
                total = total + Integer.parseInt(args[i]);
                count++;
            }
            System.out.println("TOTAL NUMBER OF INPUT" + count);
            System.out.println("TOTAL SUM OF VALID INPUT" + total);
        } catch (NumberFormatException e) {
            System.out.print("ENTER VALID NUMBER ONLY" + e);
        }
    }
}
