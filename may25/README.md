# 2023May25 • 하샤드 수

### **문제 설명 :**

양의 정수 `x`가 하샤드 수이려면 `x`의 자릿수의 합으로 `x`가 나누어져야 합니다. 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다. 자연수 `x`를 입력받아 `x`가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.

### 제한 조건

- `x`는 1 이상, 10000 이하인 정수입니다.

### 입출력 예

| x | return |
| --- | --- |
| 10 | true |
| 12 | true |
| 11 | false |
| 13 | false |

```java
package exam;
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
```

### **문제 해결 과정:**

**Keyword:** *str.charAt()-'0'; // 문자열에서 정수를 구하는 과정*

중간에 문자열을 정수로 변환하는 과정에서 계속 오류를 겪었다. 

str.charAt(i)-'0'; 의 로직을 정확히 이해하지 못하고 코드를 작성하다보니 정확한 결과값을 얻지 못했다.

문자열에서 ASCII 코드 0~9는 48~57이다. 

내가 정수로 변환하고자 하는 숫자가 5라면 5의 ASCII코드는 53 0의 ASCII코드는 48이므로

53 - 48 을 통해 5라는 정수를 얻어내는 로직이지만,

여기서 나는 제대로된 로직 이해가 되지않아  문자열 ‘0’을 빼는게 아닌 정수 0을 빼는 오기입으로 인해 원하는 결과값이 나오지 않게됬다.
