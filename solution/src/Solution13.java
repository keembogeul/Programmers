public class Solution13 {
    public int solution(int n) {
        int answer = 0;
        // n을 3진법 상에서 뒤집은 내용을 String 형태로 담아줌
        String ans = "";

        // while 문으로 ans 에 n을 3으로 나눈 값의 나머지를 담아줌
        // ans 에 담기는 값 = n을 3진법 상에서 앞뒤로 뒤집은 값
        while(n != 0) {
            ans += n % 3;
            n /= 3;         // 3으로 나눈 몫을 다시 n 값으로
        }

        // Integer.parseInt(String, n)
        // String 을 n 진법으로 표현한 int 값 리턴
        answer = Integer.parseInt(ans, 3);
        return answer;
    }

    public static void main(String[] args) {
        Solution13 sol = new Solution13();
        int n = 45;
        int answer = sol.solution(n);
        System.out.println(answer);
    }
}
