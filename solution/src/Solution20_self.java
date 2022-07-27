import java.util.Arrays;
import java.util.Collections;

public class Solution20_self {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");

        Arrays.sort(str, Collections.reverseOrder());
        for (String i : str) {
            answer += i;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution20_self sol = new Solution20_self();
        String s = "Zbcdefg";
        String answer = sol.solution(s);
        System.out.println(answer);
    }
}
