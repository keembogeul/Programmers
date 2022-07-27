public class Solution11_self {
    public long solution(long num) {
        // 작업의 횟수 리턴
        long answer = 0;

        // num 값이 결국 1이되면 끝나기 때문에
        // while 문으로 num 이 1이 아니면 계속 돌려줌
        while(num != 1) {
            // num 이 짝수이면 num 값을 2로 나눈 몫으로 바꿔주고 횟수 1 증가시킴
            if(num%2 == 0) {
                num /= 2;
                answer++;
                // 홀수이면 num 값에 3을 곱하고 1을 더해주고 횟수 1 증가시킴
            } else if(num%2 != 0) {
                num = (num*3) + 1;
                answer++;
                // 결국 num 값이 1이 되면 반복문을 빠져나옴
            } else if(num == 1) {
                break;
            }
        }

        // 횟수가 500번이 넘어가면 answer 값에 -1 리턴
        if(answer > 500) {
            answer = -1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution11_self sol = new Solution11_self();
        long num = 6;
        long answer = sol.solution(num);
        System.out.println(answer);
    }
}
