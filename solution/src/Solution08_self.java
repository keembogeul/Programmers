import java.util.Arrays;
public class Solution08_self {
    public long solution(long n) {
        long answer = 0;
        // n값을 String 으로 변환
        String str = Long.toString(n);
        // 한글자씩 쪼개서 배열 생성
        String[] arr = str.split("");

        // 일다 오름차순 정렬
        Arrays.sort(arr);

        // 내림차순의 숫자가 문자열 형태로 들어갈 빈 문자열 생성
        String ans = "";

        // 글자를 뒤에서 부터 넣어주기 위해 for 문을 거꾸로 돌림
        for(int i = arr.length-1; i >= 0; i--) {
            ans += arr[i];
        }

        // Long 형태로 변환
        answer = Long.parseLong(ans);
        return answer;
    }

    public static void main(String[] args) {
        Solution08_self sol = new Solution08_self();
        long n = 118372;
        long answer = sol.solution(n);
        System.out.println(answer);
    }
}
