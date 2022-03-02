import java.util.Scanner;
import java.util.Arrays;

class sorting_string {
    String[] Sorting(String a[], int n) {
        String temp;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i].compareTo(a[j]) > 0) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        String arr[] = new String[n];
        System.out.print("Enter the element in array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        System.out.println("ELEMENT IN ARRAY");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + "\t");
        }
        System.out.println("");
        sorting_string s = new sorting_string();
        arr = s.Sorting(arr, n);
        System.out.println("After sorting");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + "\t");
        }
        System.out.println("");

    }

}
