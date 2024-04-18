package Java_End_Of_File;

import java.io.*;
import java.util.Scanner;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int line = 1;
        
        while(scanner.hasNext()){
            String input = scanner.nextLine();
            System.out.println(line + " " + input);
            line++;
        }
        
    }
}