import java.util.ArrayList;

public class Solution18_self {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] person1 = {1, 2, 3, 4, 5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int score1 = 0, score2 = 0, score3 = 0;

        for (int i = 0; i < answers.length; i++) {
            if (person1[i%person1.length] == answers[i]) score1++;
            if (person2[i%person2.length] == answers[i]) score2++;
            if (person3[i%person3.length] == answers[i]) score3++;
        }

        int max = Math.max(Math.max(score1, score2), score3);
        ArrayList<Integer> answerList = new ArrayList<>();
        if (score1 == max) answerList.add(1);
        if (score2 == max) answerList.add(2);
        if (score3 == max) answerList.add(3);

        answer = new int[answerList.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution18_self sol = new Solution18_self();
        int[] answers = {1,3,2,4,2};
        int[] answer = sol.solution(answers);
        for (int i : answer) {
            System.out.println(i);
        }
    }
}
