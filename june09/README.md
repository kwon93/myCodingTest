# 08June2023 • 제일 작은 수 제거하기

### **문제 설명 :**

정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.

### 제한 조건

- arr은 길이 1 이상인 배열입니다.
- 인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.

### 입출력 예

| arr | return |
| --- | --- |
| [4,3,2,1] | [4,3,2] |
| [10] | [-1] |

---

```java
public class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        int min = arr[0];
        int[] mOne = {-1};
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] == min){
                continue;
            }
            answer[i] = arr[i];
        }

        if(answer.length == 0){
            return mOne;
        }

        return answer;
    }
}
```

**1차 풀이.**

### **문제 해결 과정:**

처음 문제를 해결하면서 완성한 코드는 IDE에서나 테스트케이스에서는 실행이 문제없었지만 

제출시에 여러가지 테스트를하면서 런타임 에러가 발생했다. 

그 이유를 찾아보니 `int[] answer = new int[arr.length-1];` 이부분에서 ArrayBoundsOfException이 발생해 전부 실패 처리가 되어 런타임 에러가 발생한것으로 파악했고 문제 코드 한줄 수정만으로는 런타임에러를 해결할 수 없기때문에 처음부터 다시 다른 방법으로 코드를 작성하기로 했다.

```java
public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] one = {-1};
        Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).forEach(list::add);
        list.remove(list.size()-1);
        int[] answer =new int[list.size()];

        for (int i = 0; i < list.size() ; i++) {
            answer[i] = list.get(i);
        };

        if(answer.length == 0){
            return one;
        }

        return answer;
    }
```

**2차 풀이.**

어제 배운 스트림을 응용해보기로 생각했고,

배열을 ArrayList로 사용하면 동적으로 배열 용량을 조절하기때문에 되지않을까 싶었다.

IDE와 테스트케이스에서는 문제없이 풀리지만 ,

런타임 에러는 안떴지만 실패처리로 뜸. 

```jsx
package june09;

import java.util.*;
public class Solution {
    public int[] solution(int[] arr) {
        int[] clArr = arr.clone();
       Arrays.sort(clArr);
       int min = clArr[0];
       ArrayList<Integer> arrayList  = new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] != min){
                arrayList.add(arr[i]);
            }
        }
        int[] answer;
        if (arrayList.size() == 0) {
            answer = new int[1];
            answer[0] = -1;
        }else {
            answer = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                answer[i] = arrayList.get(i);
            }
        }
       return answer;
    }
}
```

**3차 풀이**

하루종일 해답이 나오지않아 구글링의 도움을 조금 받아 해결했다. 

원본배열을 clone() 로 카피한다음에 sort() 로 오름차순 정렬을 한다. 

오름차순 정렬로 자연스럽게 제일 작은 숫자가 인덱스 0 으로 오게되고 인덱스 0이 아닌값들을 

ArrayList에 넣은뒤 다시 두가지 경우에 따라 기본타입 배열화해 Return하는 로직을 완성했다…

간단한 코드였지만 클론을 만들생각을 해보지못했다는점이 아쉬웠다.
