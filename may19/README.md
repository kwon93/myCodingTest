# 2023May19 • 자연수 뒤집어 배열로 만들기

### **문제 설명 :**

자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

```java
package may19;

import java.util.ArrayList;

class Solution {
    public long[] solution(long n) {
    		
    	ArrayList<Long> arr = new ArrayList<>(); // ArrayList에 숫자를 넣는다 
    	while(n > 0) {
    		arr.add((long) n%10); // 뒷자리부터 10으로 나눈 나머지값을 List에 넣는다
    		n /= 10;
    	}
    	
    	long[] answer = new long[arr.size()]; // ArrayList값을 롱타입 배열에 넣어준
    	for(int i = 0; i < arr.size(); i++) {
    		answer[i] = arr.get(i);
    	}
    	
        return answer;
    }
    
}

---

package may19;

import java.util.ArrayList;

public class exam {
	public static void main(String[] args) {
		Solution s = new Solution();
		long[] arr = s.solution(12345678987654321l);
		for (long i : arr) {
			System.out.print(i);
		}
		
		12345678987654321 출력됨.
		
	}
}
```

### **문제 해결 과정 :**

while문에서 주어진 n의 뒷자리 수 부터 나머지값을 구해 배열에 넣어주기때문에

reverse() 메소드는 필요없었다.

다만 ArrayList로 리턴을하려니까 계속 컴파일오류가 발생함.

리턴타입과 어레이리스트에대해 좀더 공부해보고 다시 코드를 수정해봐야겠다.
