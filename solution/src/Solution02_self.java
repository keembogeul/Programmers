import java.util.*;

public class Solution02_self {
    public int[] solution(int[] arr, int divisor) {
        // 배열 arr 에서 divisor 로 나누어지는 수의 개수를 구할 cnt
        int cnt = 0;

        // for 문을 돌며 arr[i] 가 divisor 로 나누어지면 cnt 를 증가시킴
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                cnt++;
            }
        }

        // 나누어지는 수가 하나도 없다면 answer 배열에 -1만 넣어 리턴해줌
        if (cnt == 0) {
            int[] answer = {-1};
            return answer;
        }

        // answer 배열을 초기화 시켜줌 (크기는 나누어떨어지는 수의 개수)
        int[] answer = new int[cnt];
        // answer 의 인덱스는 같이 i로 해주면 위에서 초기화해준 배열의 길이와 맞지 않아 오류
        // 따로 j로 지정해주고 if 문을 통과할 때만 증가시켜줌
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                answer[j++] = arr[i];
            }
        }
        // 오름차순 정렬
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        Solution02_self sol = new Solution02_self();
        int[] arr = {15, 22, 34, 49};
        int divisor = 5;
        int[] answer = sol.solution(arr, divisor);

        for (int i : answer) {
            System.out.println(i);
        }
    }
}