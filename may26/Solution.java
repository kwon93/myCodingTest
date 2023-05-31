package may26;

import java.util.Arrays;
//정수를 받는다 -> 정수를 2개를 배열에 담는다. -> 오름차순으로 정렬한다
//-> for문 초기값에 a 조건값에  b를 대입한 뒤 answer 변수에 다 더한다
class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int[] arr = {a,b};
        Arrays.sort(arr);

        for (int i = arr[0]; i <= arr[1] ; i++) {
            answer += i;
        }
        return answer;
    }
}
