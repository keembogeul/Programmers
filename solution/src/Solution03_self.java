public class Solution03_self {
    public String solution(int n) {
        // 수박..을 리턴해줄 문자얼 값
        String answer = "";

        // 입력된 값 n번 만큼 찍어줘야하기 때문에 1부터 시작해 n까지
        for (int i = 1; i <= n; i++) {
            // 홀수이면 "수" 를 더해줌
            if (i % 2 == 1) {
                answer += "수";
                // 그렇지 않고 짝수이면 "박" 을 더해줌
            } else if (i % 2 == 0) {
                answer += "박";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution03_self sol = new Solution03_self();
        String answer = sol.solution(8);
        System.out.println(answer);
    }
}

