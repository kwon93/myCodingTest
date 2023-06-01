# 2023June01 • 나누어 떨어지는 숫자 배열

### **문제 설명**

array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.

divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.

### 제한사항

- arr은 자연수를 담은 배열입니다.
- 정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
- divisor는 자연수입니다.
- array는 길이 1 이상인 배열입니다.

### 입출력 예

| arr | divisor | return |
| --- | --- | --- |
| [5, 9, 7, 10] | 5 | [5, 10] |
| [2, 36, 1, 3] | 1 | [1, 2, 3, 36] |
| [3,2,6] | 10 | [-1] |

```java
package june01;

import java.util.*;

public class Solution {

    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<Integer>(); // return할 배열의 크기를 모르기때문에 동적인 ArrayList 선언
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%divisor == 0) { // arr의 인덱스가 divisor로 나눠진다면
                list.add(arr[i]); //해당 인덱스 값을 ArrayList에 추가
            }
        }
        if (list.isEmpty()) {
            list.add(-1); // 만약 ArrayList가 비어있다면 -1을 추가하고 return
        }
        answer = new int[list.size()]; // return할 배열의 크기를 선언한다

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i); // ArrayList에 담아둔값을 배열에 담는다.
        }
        Arrays.sort(answer); // sort() 사용해 오름차순으로 정렬
        return answer;
    }
}
```

### **문제 설명 :**

새로운 메서드사용도 없었고 어려운문제는 아니였다. 텍스트로 어떻게 로직을 구현할지 적어두고 하나하나 구현해나갔다.
