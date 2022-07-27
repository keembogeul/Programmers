public class Solution17_self {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int minCnt = 0;
        int cnt = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (lottos[i] == win_nums[j]) {
                    minCnt++;
                }
            }
            if (lottos[i] == 0) {
                cnt++;
            }
        }
        int maxCnt = minCnt + cnt;

        if (minCnt == 0) {
            if(maxCnt == 0) {
                answer[0] = 6;
                answer[1] = 6;
            } else {
                answer[0] = 7 - maxCnt;
                answer[1] = 6;
            }
        } else {
            answer[0] = 7 - maxCnt;
            answer[1] = 7 - minCnt;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution17_self sol = new Solution17_self();
        int[] lottos = {45, 4, 35, 20, 3, 9};
        int[] win_nums = {20, 9, 3, 45, 4, 35};
        int[] answer = sol.solution(lottos, win_nums);
        for (int i : answer) {
            System.out.println(i);
        }
    }
}
