import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int marks = scanner.nextInt();
            
            if (marks > 90) {
                System.out.println("Excellent");
            } else if (marks > 80 && marks <= 90) {
                System.out.println("Good");
            } else if (marks > 70 && marks <= 80) {
                System.out.println("Fair");
            } else if (marks > 60 && marks <= 70) {
                System.out.println("Meets Expectations");
            } else {
                System.out.println("Below Expectations");
            }
        }
        scanner.close();
    }
}
