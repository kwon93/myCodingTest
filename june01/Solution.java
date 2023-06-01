package june01;

import java.util.*;

public class Solution {

    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<Integer>(); // return할 배열의 크기를 모르기때문에 동적인 ArrayList 선언
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%divisor == 0) { // arr의 인덱스가 divisor로 나눠진다면
                list.add(arr[i]); //해당 인덱스 값을 ArrayList에 추가
            }
        }
        if (list.isEmpty()) {
            list.add(-1); // 만약 ArrayList가 비어있다면 -1을 추가하고 return
        }
        answer = new int[list.size()]; // return할 배열의 크기를 선언한다

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i); // ArrayList에 담아둔값을 배열에 담는다.
        }
        Arrays.sort(answer); // sort() 사용해 오름차순으로 정렬
        return answer;
    }
}
