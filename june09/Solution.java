package june09;

import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        int[] clArr = arr.clone();
       Arrays.sort(clArr);
       int min = clArr[0];
       ArrayList<Integer> arrayList  = new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] != min){
                arrayList.add(arr[i]);
            }
        }
        int[] answer;
        if (arrayList.size() == 0) {
            answer = new int[1];
            answer[0] = -1;
        }else {
            answer = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                answer[i] = arrayList.get(i);
            }
        }
       return answer;
    }
}
