package may31;

public class Solution {
    public int solution(long num) {
        int cnt = 0;
        if(num == 1){ // num이 1이라면 바로 0을 return
            return 0;
        }
        while (!(cnt > 500) && !(num == 1)){ // num이 1 그리고 cnt가 500보다 높다면 while 탈
            if (num%2 == 0){ // num이 짝수라면 
                num /= 2; // num을 2로 나눈다.
                cnt++; // 그 후에 cnt +1
            } else if (num%2 == 1) { // num이 홀수라면
                num = (num * 3) + 1; // num을 3 곱하고 1을 더한다.
                cnt++; // 그 후에 cnt +1
            }
        }
       if(cnt > 500){ //cnt가 500이 넘어 while문을 빠져나올경우
            return -1; // -1을 return한다.
        }
        return cnt; //num이 1이되어 while문을 빠져나올경우 cnt값을 return한다.
    }
}