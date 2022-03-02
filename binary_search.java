import java.util.Scanner;

public class binary_search {
    public static void main(String args[]) {
        int search, array[], n, mid, low, high;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        n = sc.nextInt();
        array = new int[n];
        System.out.println("Enter the element in sorted order");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println(" \n Enter the element to search");
        search = sc.nextInt();
        low = 0;
        high = n - 1;
        mid = (low + high) / 2;
        while (low <= high) {
            if (array[mid] > search) {
                high = mid - 1;
            } else if (search == array[mid]) {
                System.out.print("Element is found at postion:" + (mid + 1) + ".");
                break;
            } else {
                low = mid + 1;
            }
            mid = (low + high) / 2;
        }
        if (low > high) {
            System.out.println("Elelemt not found");
        }
    }

}
