package may19;

import java.util.ArrayList;

class Solution {
    public long[] solution(long n) {
    		
    	ArrayList<Long> arr = new ArrayList<>(); // ArrayList에 숫자를 넣는다 
    	while(n > 0) {
    		arr.add((long) n%10); // 뒷자리부터 10으로 나눈 나머지값을 List에 넣는다
    		n /= 10;
    	}
    	
    	long[] answer = new long[arr.size()]; // ArrayList값을 롱타입 배열에 넣어준다.
    	for(int i = 0; i < arr.size(); i++) {
    		answer[i] = arr.get(i);
    	}
    	
        return answer;
    }
    
}