package may25;

/*
* 숫자를 받는다 -> 문자열로 변환한다. -> 
* 다시 숫자 배열로 변환 -> 
* arr[0] + arr[1] = x% ==0 이라면 true
* */
public class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String str = Integer.toString(x); //문자열로 변환
        int[] arr = new int[str.length()];
        int sum = 0;

        for (int i = 0; i < str.length(); i++) { // 숫자 배열에 집어넣기
            arr[i] = str.charAt(i)-'0';
        }

        for (int i = 0; i < arr.length ; i++) { // 배열안에 있는 수를 합하기
            sum += arr[i];
        }
        
        if (x%sum == 0){ // 합계한값으로 x를 나눈 나머지가 0 이라면  true
            return true;
        }else {
            return false; //아니라면 false값 반환
        }

    }
}