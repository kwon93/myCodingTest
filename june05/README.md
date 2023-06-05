# 05June2023 • 음양 더하기

### **문제 설명**

어떤 정수들이 있습니다. 이 정수들의 절댓값을 차례대로 담은 정수 배열 absolutes와 이 정수들의 부호를 차례대로 담은 불리언 배열 signs가 매개변수로 주어집니다. 실제 정수들의 합을 구하여 return 하도록 solution 함수를 완성해주세요.

---

### 제한사항

- absolutes의 길이는 1 이상 1,000 이하입니다.
    - absolutes의 모든 수는 각각 1 이상 1,000 이하입니다.
- signs의 길이는 absolutes의 길이와 같습니다.
    - `signs[i]` 가 참이면 `absolutes[i]` 의 실제 정수가 양수임을, 그렇지 않으면 음수임을 의미합니다.

---

### 입출력 예

| absolutes | signs | result |
| --- | --- | --- |
| [4,7,12] | [true,false,true] | 9 |
| [1,2,3] | [false,false,true] | 0 |

```java
/* 
for문안에서 if문으로 abs[i] 가 sings[i]의 값이 true면 양수로 변환 false면 음수로변환해야함.
if문에 sign[i]의 값이 true일 경우 false일경우 작성
->abs[i]의 값이 음수라면 *-1을 해준다.
->다시 또 for문으로  배열안에 값을 answer에 순서대로 다 더한다
*/

public class Solution3232 {
    public int solution1(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i <absolutes.length ; i++) {
            if (!signs[i]) {
                absolutes[i] = absolutes[i] * -1;
            }
            answer += absolutes[i];
        }
        return answer;
    }
}
```

### **문제 해결 과정:**

이제 정답률 높은 1레벨은 쉽게 풀 수 있게됬다…
