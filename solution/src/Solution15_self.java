import java.util.ArrayList;

public class Solution15_self {
    public int[] solution(int []arr) {
        // 총 몇 개의 수가 들어갈 지 알 수 없어 List 로 설정
        ArrayList<Integer> answerList = new ArrayList<Integer>();
        // 앞 순서의 arr 배열 값을 넣어줄 변수를 -1로 선언(배열의 원소가 0부터 9까지이기 때문)
        int value = -1;

        // for 문으로 arr 배열을 돌며
        for (int i : arr) {
            // 각 인덱스의 값이 value 값과 같은지 아닌지 비교
            if (i != value) {
                // 다르면 리스트에 넣어줌
                answerList.add(i);
                // 계속해서 value 값은 앞 순서의 arr 배열의 원소값으로 바뀜
                value = i;
            }
        }
        // Integer List 를 정수의 배열로 바꾸어주는 메소드
        int[] answer = answerList.stream().mapToInt(i->i).toArray();

        return answer;
    }

    public static void main(String[] args) {
        Solution15_self sol = new Solution15_self();
        int[] arr = {4, 4, 4, 3, 3};
        int[] answer = sol.solution(arr);

        for (int i : answer) {
            System.out.println(i);
        }
    }
}
