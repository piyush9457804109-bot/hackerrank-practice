# 2. Conditional - Grading System (CW)

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given marks of a student as input. Display a correct message based on the following rules:

- for marks above 90, print "Excellent".
- for marks above 80 and less than equal to 90, print "Good"
- for marks above 70 and less than equal to 80, print "Fair".
- for marks above 60 and less than equal to 70, print "Meets Expectations".
- for marks below and equal to 60, print "Below Expectations".

 **Input Format** 

There is a single integer `N`.

 **Constraints** 

1 <= |N| <= 100

 **Output Format** 

Print a single string in a line.

`Example 1`

Input

95 Output

Excellent Explanation

As according to the given condition, for N (marks) >90 - Excellent is printed

`Example 2`

Input

75 Output

Fair Explanation

As according to the given condition, for 70 < N (marks) <= 80 - Fair is printed

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-13T06:11:40.827Z  

```java
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

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/2-conditional-cw/problem)