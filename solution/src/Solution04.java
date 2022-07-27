import java.util.Arrays;
 /*
 < 완주하지 못한 선수 >
 - 참가자 배열과 완주자 배열이 있음
 - 참가자 배열과 완주자 배열의 길이 차이는 1
 - 참가자 이름은 1개 이상 20개 이하의 알파벳 소문자
 - 동명이인 있을 수 있음
 */
public class Solution04 {
    public String solution(String[] participant, String[] completion) {
        // 완주하지 못한 선수가 들어갈 빈 문자열
        String answer = "";

        // 참가자 & 완주자 배열을 정렬해줌
        Arrays.sort(participant);
        Arrays.sort(completion);

        // 정렬해주었기 때문에 참가자의 맨 마지막에 완주하지 못한 사람이 온다면
        // answer 에 participant 의 마지막 인덱스 값을 넣어줌
        // 그렇지 않고 오름차순 정렬 후에 두 배열을 비교하다 다른 이름이 나온다면
        // 그 때 participant 에 있는 이름이 완주하지 못한 사람이기 때문에 리턴
        for(int i = 0; i < completion.length; i++) {
            if(!participant[i].equals(completion[i])) {
                answer = participant[i];
                break;
            }
            answer = participant[participant.length - 1];
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution04 sol = new Solution04();
        String[] participant1 = {"a", "b", "c", "d", "e"};
        String[] completion1 = {"a", "c", "d", "e"};
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"nikola", "filipa", "marina", "josipa"};
        String answer = sol.solution(participant1, completion1);
        System.out.println(answer);
    }
}
