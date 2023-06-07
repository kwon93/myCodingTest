package june07;

public class Solution{
    public int solution(int[] numbers) {
        int answer = 0;
        int sum1 = 0; // 0~9 까지의 총합을 계산할 수를 담을 변수를 선언
        int sum2 = 0; // numbers[] 의 총합을 계산할 수를 담을 변수를 선언
        
        for (int i = 0; i < 10 ; i++) { // sum1에 0~9까지의 수를 다 더한다.
            sum1 += i;
        }

        for (int i = 0; i < numbers.length ; i++) {
            sum2 += numbers[i]; // sum2에 numbers에 담긴 숫자를 다 더한다.
        }
        answer = sum1 - sum2;
        //sum1에서 sum2를 뺀 값을 구하면 0~9 사이에 없는 정수를 더한 값이 나온다.
        return answer;
    }
}