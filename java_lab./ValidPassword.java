import java.util.Scanner;

public class ValidPassword {
    static void valid_password(String pswd) {
        if (pswd.length() < 8) {
            System.out.println("PASSWORD IS INVALID LENGTH");
            in();
        } else {
            int NumCount = 0;
            int CharCount = 0;
            for (int i = 0; i < pswd.length(); i++) {
                char c = pswd.charAt(i);
                if (c >= 'A' || c <= 'Z') {
                    CharCount++;
                }
                if (c >= '0' || c <= '9') {
                    NumCount++;
                }
            }
            if (NumCount < 2 || CharCount < 2) {
                System.out.println("INVALID PASSWORD");
                in();
            } else {
                System.out.println("VALID PASSWORD");
            }
        }
    }

    static void in() {
        String password;
        Scanner sc = new Scanner(System.in);
        System.out.print(
                "ENTER THE PASSWORS" + "(PASSWORD MUST BE * CHARACTER 2 MINIMUM ALPHABET AND 2 MINIMUMN CHARCTER)");
        password = sc.next();

        valid_password(password);
    }

    public static void main(String[] args) {

        in();
    }

}
