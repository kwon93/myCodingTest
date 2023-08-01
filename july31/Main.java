package july31;


import java.io.*;

/*
* 3kg 박스 , 5kg 박스
* 숫자 n 이 주어지면 위의 박스로 최소 박스 수를 구해야함.
*
* n = 15
* 5kg * 3 = 3박스
* n = 18
* 5 * 3, 3 * 1 = 4박스
*
* 최적화된 박스 개수를 구할 수 없다면 -1 return
* */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        while (true){
            if (N == 4 || N == 7){ 
                System.out.println(-1);
                return;
            }
            if (N % 5 == 0){
                int  five = N / 5;
                int result = five + cnt;
                System.out.println(result);
                return;
            }else {
                N -= 3;
                cnt++;
            }

        }

    }
}
