public class Solution09_self {
    public long solution(long n) {
        long answer = 0;
        // 제곱근을 판별하는 메소드를 사용하여 sqrt 에 n의 제곱근 값을 넣어줌
        long sqrt = (long)Math.sqrt(n);

        // n이 sqrt 의 제곱이 맞으면
        if (Math.pow(sqrt, 2) == n) {
            // answer 에 (n의 제곱근 + 1)의 제곱값을 넣어줌
            answer = (long) Math.pow(sqrt+1, 2);
        } else {
            // 아닐 경우 -1 리턴
            answer = -1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution09_self sol = new Solution09_self();
        long n = 120;
        long answer = sol.solution(n);
        System.out.println(answer);
    }
}
