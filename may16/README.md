# 2023May16  • 나머지가 1이 되는 수 찾기

### **문제 설명**

자연수 `n`이 매개변수로 주어집니다. `n`을 `x`로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 `x`를 return 하도록 solution 함수를 완성해주세요. 답이 항상 존재함은 증명될 수 있습니다.

```java
package may16;

class Solution {
	
    public int solution(int n) {
        int x = 0;
        int div = 0;

        for(int i = 1; i <= n; i++) {
        	div = n % i;
        	if(div == 1) {
        		x = i;
        		break;
        	}
        }
        return x;
    }
}
```

### **문제 해결 과정:**

반복문을 사용해서 1부터 자연수 `n`의 나머지를 구하는 가장 작은 자연수를 구하기로 생각을했고,

`for`문안에 `if`문을 넣어 만약 나머지값 변수인 `div`가 1인 숫자를 찾으면 break를 넣어 함수를 중단하고  `x`값을 리턴시켜 과제를 완성했다.

 

###
