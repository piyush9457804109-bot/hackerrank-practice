import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            count++;
            
            if (num % 2 != 0) {
                System.out.println(count);
                break;
            }
        }
        scanner.close();
    }
}
