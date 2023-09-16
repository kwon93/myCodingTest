import java.io.IOException;
import java.util.Scanner;


/**
*
* 첫째 줄에 16진수 수가 주어진다. 이 수의 최대 길이는 6글자이다.
* 16진수 수는 0~9와 A~F로 이루어져 있고, A~F는 10~15를 뜻한다. 또, 이 수는 음이 아닌 정수이다.
*
* a -> 10
* b -> 11
* c -> 12
*
*/

public class Main {
            public static void main(String[] args) throws IOException {
                             Scanner in = new Scanner(System.in);
                             String input = in.next();
                             System.out.println(Integer.parseInt(input,16));
                             in.close();
             }
}
