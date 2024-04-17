package Java_Loops_II;

import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            for(int j = 0; j < n; j++){
                int result = 0;
                for(int k = 0; k <= j; k++){
                    result += powerResult(2, k) * b;
                }
                System.out.print((result+a) + " ");
            }
            System.out.println();
        }
        in.close();
    }
    
    static int powerResult (int base, int power){
        int value = 1;
        
        while(power != 0){
            value = value * base;
            power--;
            
        }
        return(value);
    }
}

