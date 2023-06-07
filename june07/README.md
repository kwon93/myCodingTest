# 07June2023 • 없는 숫자 더하기

### **문제 설명:**

0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 `numbers`가 매개변수로 주어집니다. `numbers`에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.

---

### 제한사항

- 1 ≤ `numbers`의 길이 ≤ 9
    - 0 ≤ `numbers`의 모든 원소 ≤ 9
    - `numbers`의 모든 원소는 서로 다릅니다.

---

### 입출력 예

| numbers | result |
| --- | --- |
| [1,2,3,4,6,7,8,0] | 14 |
| [5,8,4,0,6,7,9] | 6 |

```java
public class Solution{
    public int solution(int[] numbers) {
        int answer = 0;
        int sum1 = 0; // 0~9 까지의 총합을 계산할 수를 담을 변수를 선언
        int sum2 = 0; // numbers[] 의 총합을 계산할 수를 담을 변수를 선언
        
        for (int i = 0; i < 10 ; i++) { // sum1에 0~9까지의 수를 다 더한다.
            sum1 += i;
        }

        for (int i = 0; i < numbers.length ; i++) {
            sum2 += numbers[i]; // sum2에 numbers에 담긴 숫자를 다 더한다.
        }
        answer = sum1 - sum2;
        //sum1에서 sum2를 뺀 값을 구하면 0~9 사이에 없는 정수를 더한 값이 나온다.
        return answer;
    }
}
```

### **문제 해결 과정:**

바로 정답이 1시간넘게 안나와서 답을 찾아봄…

이 문제 keypoint 는 0~9의 총합을 구하고 그 값에서 numbers[] 배열에 없는값을 뺴는거였다. 

정답 제출 후 foreach문을 사용해서 푼 다른사람의 풀이가 너무 괜찮아서 첨부함.

### 다른 사람의 풀이:

0~9의 총합인 45라는 int 정수를 먼저 선언한뒤 foreach문으로 numbers 인덱스를 다 돌면서 45에서 숫자를 뺀 뒤  남은 숫자를 return 하면 numbers[] 배열에 없는 숫자가 나오게 된다.

```java
class Solution {
    public int solution(int[] numbers) {
        int sum = 45;
        for (int i : numbers) {
            sum -= i;
        }
        return sum;
    }
}
```
