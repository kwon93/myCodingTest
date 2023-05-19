package may18;

import java.util.ArrayList;

public class Solution {
	

    public int solution(int n) {
        int answer = 0; // 숫자를 받는다 ->
        ArrayList<Integer> numArr = new ArrayList<>(); 
        while(n > 0) { //잘라서 배열에 넣는다 ->
        	numArr.add(n%10);
        	n /= 10;
        }
        for (Integer item : numArr) { //foreach문으로 다 더한다
			answer += item; 
		}
        return answer;
        
//      숫자를 받는다 -> 
//      잘라서 배열에 넣는다 ->
//      foreach문으로 다 더한다
    }
    
    public static void main(String[] args) {
		Solution sum = new Solution();
		int result = sum.solution(987);
		System.out.println(result);
	}
}