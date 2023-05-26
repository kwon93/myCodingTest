# 2023May26 • 두 정수 사이의 합

### **문제 설명 :**

두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.

예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.

### 제한 조건

- a와 b가 같은 경우는 둘 중 아무 수나 리턴하세요.
- a와 b는 -10,000,000 이상 10,000,000 이하인 정수입니다.
- a와 b의 대소관계는 정해져있지 않습니다.

### 입출력 예

| a | b | return |
| --- | --- | --- |
| 3 | 5 | 12 |
| 3 | 3 | 3 |
| 5 | 3 | 12 |

```jsx
package may26;

import java.util.Arrays;
//정수를 받는다 -> 정수를 2개를 배열에 담는다. -> 오름차순으로 정렬한다
//-> for문 초기값에 a 조건값에  b를 대입한 뒤 answer 변수에 다 더한다
class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int[] arr = {a,b};
        Arrays.sort(arr);

        for (int i = arr[0]; i <= arr[1] ; i++) {
            answer += i;
        }
        return answer;
    }
}

class Main{
    public static void main(String[] args) {
        Solution s = new Solution();
        long result = s.solution(5,3);
        System.out.println(result);
    }
}
```

### **문제 해결 과정 :**

간단한 합을 구하는 식이라 어렵지 않게 코드를 작성할 수 있었다.
