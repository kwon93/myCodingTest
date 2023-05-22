# 2023May18 • 자릿수 더하기

### **문제 설명 :**

자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.

예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.

```java
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
```

### **문제 해결 과정 :**

해당 함수를 작성하기위해 우선 

[숫자를 받는다 ->  잘라서 배열에 넣는다 -> foreach문으로 다 더한다] 

 순서의 방식을 적고 코드 작성에 들어갔다.
