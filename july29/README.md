# 29July2023 개수 세기

| 시간 제한 | 메모리 제한 | 제출 | 정답 | 맞힌 사람 | 정답 비율 |
| --- | --- | --- | --- | --- | --- |
| 1 초 | 256 MB | 76764 | 48571 | 42237 | 64.495% |

## 문제

총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.

## 입력

첫째 줄에 정수의 개수 N(1 ≤ N ≤ 100)이 주어진다. 둘째 줄에는 정수가 공백으로 구분되어져있다. 셋째 줄에는 찾으려고 하는 정수 v가 주어진다. 입력으로 주어지는 정수와 v는 -100보다 크거나 같으며, 100보다 작거나 같다.

## 출력

첫째 줄에 입력으로 주어진 N개의 정수 중에 v가 몇 개인지 출력한다.

```java
package july29;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/*
* 첫째 줄에 정수의 개수 N(1 ≤ N ≤ 100)이 주어진다.
* 둘째 줄에는 정수가 공백으로 구분되어져있다. 셋째 줄에는 찾으려고 하는 정수 v가 주어진다.
* 입력으로 주어지는 정수와 v는 -100보다 크거나 같으며, 100보다 작거나 같다.
* 1 4 1 2 4 2 4 2 3 4 4
* 1 0 2 2 3 0 4 = 7
* 총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
* */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrLength = scanner.nextInt();
        int arr[] = new int[arrLength];

        for (int i = 0; i <arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int v = scanner.nextInt();
        IntStream stream = Arrays.stream(arr);
        int count = (int)stream.filter(ar -> ar == v)
                .count();

        System.out.println(count);
        scanner.close();

    }
}
```

### 해결 과정 :

제출 양식이 프로그래머스와 차이가 있어서 로직은 금방 해결했지만 

제출 과정에서 컴파일오류, 런타임오류를 겪어 당황했다.
