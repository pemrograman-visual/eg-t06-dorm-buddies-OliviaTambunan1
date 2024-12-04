// 12S24029 - Adithya Philip Jona Putra Silaban
// 12S24048 - Olivia Tambunan

import java.util.*;
import java.lang.Math;

public class T06 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] buddies = new String[4];
        int i, n;

        n = 0;
        i = 0;
        inisialisasi(buddies, i);
        n = func_input(buddies, n);
        output(buddies, n);
    }
    
    public static void inisialisasi(String[] buddies, int i) {
        for (i = 0; i <= 3; i++) {
            buddies[i] = "";
        }
    }
    
    public static int func_input(String[] buddies, int n) {
        int a;

        n = 0;
        for (a = 0; a <= 3; a++) {
            buddies[a] = input.nextLine();
            if (buddies[a].equals("---")) {
                a = 4;
            } else {
                n = n + 1;
            }
        }
        
        return n;
    }
    
    public static void output(String[] buddies, int n) {
        int h;

        for (h = 0; h <= n - 1; h++) {
            System.out.println(buddies[h]);
        }
    }
}
