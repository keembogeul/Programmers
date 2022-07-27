import java.util.ArrayList;

public class Solution26_self {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> divList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n%i == 0) {
                divList.add(i);
            }
        }

        for (int i = 0; i < divList.size(); i++) {
            answer += divList.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution26_self sol = new Solution26_self();
        int n = 5;
        int answer = sol.solution(n);
        System.out.println(answer);
    }
}
