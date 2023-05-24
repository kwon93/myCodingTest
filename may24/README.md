# 2023May24 • 정수 내림차순으로 배치하기

### **문제 설명 :**

함수 solution은 정수 `n`을 매개변수로 입력받습니다. `n`의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 `n`이 118372 면 873211 을 리턴하면 됩니다.

### 제한 조건

- `n`은 1이상 8000000000 이하인 자연수입니다.

### 입출력 예

| n | return |
| --- | --- |
| 118372 | 873211 |

```java
package may24;

import java.util.*;

class Solution {
 public long solution(long n) {
       String[] list = String.valueOf(n).split(""); 
       //string.valueOf로 스트링 변환 후 -> split으로 1 2 3 4 5 공백을 기준으로 잘라냄
       
       Arrays.sort(list); //sort 오름차순 메소드로 정렬 
       
       StringBuilder sb = new StringBuilder(); 
       for (String aList : list) sb.append(aList);
       //배열을 StringBuilder를 이용해 String하나로 합침.
       
       return Long.parseLong(sb.reverse().toString());
       //reverse메소드로 내림차순으로 변경 후 parseLong으로 long 타입 변환 후 return;
 }
}

```

### **문제 해결 과정:**

**Keyword:** *String.valueOf()  [객체를 string으로 변경] , Arrays.Sort() [배열을 오름차순으로 정렬]*

*StringBuilder. [append().reverse().toString() 등의 메소드를 사용할 수 있는 클래스]*

long type의 숫자를 스트링으로 바꾼뒤 스트링을 내림차순으로 정렬후 다시 롱타입으로 변환하는 메소드 설계는 짰지만 아직 Java의 메소드 숙지가 이루어지지않아 구글에서 위의 메소드들과 클래스들을 찾아가며 과제를 완성 할 수 있었다.
