# 30June2023 • 문자열 다루기 기본

### **문제 설명**

문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.

### 제한 사항

- `s`는 길이 1 이상, 길이 8 이하인 문자열입니다.
- `s`는 영문 알파벳 대소문자 또는 0부터 9까지 숫자로 이루어져 있습니다.

### 입출력 예

| s | return |
| --- | --- |
| "a234" | false |
| "1234" | true |

---

```java
public class Solution {
	public boolean solution(String s) {
        boolean answer = false;

        if(s.length() == 4 || s.length() == 6){
            for(int i = 0; i < s.length(); i++) {
                if (s.charAt(i) > 64 && s.charAt(i) < 123) {
                    return false;
                }else{
                    answer = true;
                }
            }
        }
        return answer;
    }
}
```

### **문제 해결 과정:**

풀이 알고리즘은 금방 바로 떠올랐는데 return문을 적는 순서에서 문제가 발생해 디버깅을 통해 어디서 적당한 값을 리턴해야되는지 찾고 해결했다. 

if문 중첩이라 코드가 너무 복잡해져 마음에 들지 않는 코드
