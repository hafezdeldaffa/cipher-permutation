package org.example;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str;

    System.out.print("Enter a string: ");
    str = sc.nextLine();

    char[] charArr = str.toCharArray();
    char[] result = new char[str.length()];

    int n = charArr.length;

    for (int i = 0; i < charArr.length; i++) {
      result[i] = charArr[n - 1];
      n--;
    }

    System.out.println("Plain text is: " + Arrays.toString(charArr));
    System.out.println("Cipher text is: " + Arrays.toString(result));

    System.out.println(str);
    System.out.println(result);
  }
}
