import java.util.*;

public class string_buffer {
    public static void main(String[] args) {
        String str1, str2;
        long StartTime, total;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the string ");
        str1 = sc.next();
        System.out.println("Enter the string to append");
        str2 = sc.next();
        StartTime = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder(str1);
        for (int i = 0; i < 10000; i++) {
            builder.append(str2);
        }
        total = System.currentTimeMillis() - StartTime;
        System.out.println("TOTAL TIME TAKEN TO APPEND IN STRING BUILDER " + total + " MS");
        StringBuffer bd = new StringBuffer(str1);
        for (int i = 0; i < 10000; i++) {
            bd.append(str2);
        }
        total = System.currentTimeMillis() - StartTime;
        System.out.println("TOTAL TIME IN STRING BUFFER IS " + total + " MS");

    }
}
