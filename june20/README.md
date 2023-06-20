# 20June2023 • 문자열 내림차순으로 배치하기

### **문제 설명**

문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.

s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.

### 제한 사항

- str은 길이 1 이상인 문자열입니다.

### 입출력 예

| s | return |
| --- | --- |
| "Zbcdefg" | "gfedcbZ" |

---

```java
/*
* 문자열을 char[]에 담는다 -> 정렬을한다 -> 반복문으로 96 이상인값만 빌더1에 담기 
* -> 역정렬 -> 96이하인거 빌더 2에 담기
* -> 역정렬 -> 빌더1에 빌더 2 더하기 -> 빌더1을 answer에 넣어주고 return.
*/

public class Solution20 {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        String answer = "";
        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        for (int i = 0; i < chars.length; i++) {
            if(chars[i] > 96){
                sb.append(chars[i]);
            }
        }
        sb.reverse();

        for (int i = 0; i < chars.length ; i++) {
            if (chars[i] < 97){
                sb2.append(chars[i]);
            }
        }
        sb2.reverse();
        sb.append(sb2);

        answer = sb.toString();
        return answer;
    }
}
```

### **문제 해결 과정:**

문자를 더하거나 빼거나 연산할시에 아스키코드로 연산된다는점을 베이스로 풀이에 들어갔다. 

마지막에 빌더1에 빌더2를 어펜드하면되는데 그걸 감을 못잡아서 빌더1 + 빌더2 같은 객체 더하기 객체라는 뻘짓을 저질러서 시간이 지체됬다.
