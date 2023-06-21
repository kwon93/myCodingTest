# 21June2023• 암호 해독

### **문제 설명**

군 전략가 머쓱이는 전쟁 중 적군이 다음과 같은 암호 체계를 사용한다는 것을 알아냈습니다.

- 암호화된 문자열 `cipher`를 주고받습니다.
- 그 문자열에서 `code`의 배수 번째 글자만 진짜 암호입니다.

문자열 `cipher`와 정수 `code`가 매개변수로 주어질 때 해독된 암호 문자열을 return하도록 solution 함수를 완성해주세요.

---

### 제한사항

- 1 ≤ `cipher`의 길이 ≤ 1,000
- 1 ≤ `code` ≤ `cipher`의 길이
- `cipher`는 소문자와 공백으로만 구성되어 있습니다.
- 공백도 하나의 문자로 취급합니다.

---

### 입출력 예

| cipher | code | result |
| --- | --- | --- |
| "dfjardstddetckdaccccdegk" | 4 | "attack" |
| "pfqallllabwaoclk" | 2 | "fallback" |

---

```java
package codingTest_Lv_01.june20;
/*
* String을 char배열화 한다.-> cnt 변수선언-> StringBuiler를 선언한다. -> 반복문을 돌린다 -> 만약 cnt가 code 로 나눈값이 == 0 이라면 빌더에 chars[i]를 append
* -> cnt는 계속 1씩 증가함. -> 반복문이 끝나고 빌더를 투 스트링해서 answer에 넣어주고 return.
*
* */
public class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        int cnt = 1;
        char[] chars = cipher.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (cnt % code == 0) {
                sb.append(chars[i]);
            }
            cnt++;
        }
        answer = sb.toString();
        return answer;
    }
}
```

### **문제 설명:**

레벨1은 아니지만 0레벨치고 난이도가 있는편이기도하고 학원 스터디에서 이번주 코딩테스트 과제로 선정되어 풀게됬다. 

처음에 index를 code로 나누었을때 append했는데 인덱스는 0부터 시작이라 엄한값들만 추가하게되었고 

인덱스를 1부터시작하게 만들고싶어 cnt라는 변수를 만들어 사용했다.
