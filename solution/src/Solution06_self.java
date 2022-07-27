public class Solution06_self {
    public int solution(int n) {
        int answer = 0;

        // while 문을 사용 (조건은 n이 0이 아닐때 까지만)
        while(n != 0) {
            // answer 값에 n 을 10으로 나눈 나머지를 계속 더해줌
            // (10으로 나눈 값의 나머지는 제일 마지막 자리 숫자)
            answer += n % 10;
            // 그 후 n은 10으로 나눈 값의 몫으로 바꿔줌
            n /= 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution06_self sol = new Solution06_self();
        int n = 1010;
        int answer = sol.solution(n);
        System.out.println(answer);
    }
}
