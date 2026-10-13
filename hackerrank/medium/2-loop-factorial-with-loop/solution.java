import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            long factorial = 1;
            
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            
            System.out.println(factorial);
        }
        scanner.close();
    }
}
