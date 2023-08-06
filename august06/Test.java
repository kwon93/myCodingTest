package august06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test {
    public static void main(String[] args) throws IOException {
        int[] arr = {1, 1, 2, 2, 2, 8};
        int idx = 0, val = 0;
        Scanner sc = new Scanner(System.in);
        while(idx < 6) {
            val = sc.nextInt();
            System.out.print(arr[idx] - val + " ");
            idx++;
        }
    }
}
