import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            
            if (a % 2 != 0 && b % 2 != 0) {
                System.out.println("we are odd");
            } else {
                System.out.println("we are simple");
            }
        }
        scanner.close();
    }
}
