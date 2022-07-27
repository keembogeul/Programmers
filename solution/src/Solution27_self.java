import java.util.Arrays;

public class Solution27_self {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;

        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
            budget -= d[i];
            if (budget < 0) break;
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution27_self sol = new Solution27_self();
        int[] d = {2,2,3,3};
        int budget = 10;
        int answer = sol.solution(d, budget);
        System.out.println(answer);
    }
}
