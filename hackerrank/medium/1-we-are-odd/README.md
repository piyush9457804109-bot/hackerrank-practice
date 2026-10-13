# 1. Conditional - we are odd (CW)

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given two integers a and b. You need to perform the following operations

If both integers are odd, print `we are odd`. Else print `we are simple`.

 **Input Format** 

First line contains two variables a and b.

Example 1 Input

`1 3`

Example 2 Input

`2 5`

 **Constraints** 

-10^8 <= a, b <= 10^8

 **Output Format** 

Output will be "we are odd" if both the variables are odd numbers. Otherwise output will be "we are simple".

Example 1 Output

`we are odd`

Example 1 Output

`we are simple`

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-13T06:10:21.704Z  

```java
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

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/1-we-are-odd/problem)