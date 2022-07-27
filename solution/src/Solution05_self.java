public class Solution05_self {

    public String solution(String s) {
        String answer = "";

        // 받아오는 s 값을 한글자씩 쪼개서 배열로 만들어줌
        String[] str = s.split("");

        // 인덱스로 문자열을 수정하기 때문에 그 때 사용해줄 인덱스를 선언
        int idx = 0;

        for(int i = 0; i < str.length; i++) {
            // 배열의 요소가 공백이라면 인덱스를 0으로 만들어줌
            // 공백을 기준으로 짝/홀수 인덱스를 판단하기 때문
            if(str[i].equals(" ")) {
                idx = 0;
                // 인덱스가 짝수이면 대문자 치환
            } else if(idx % 2 == 0) {
                str[i] = str[i].toUpperCase();
                idx++;
                // 홀수이면 소문자 치환
            } else if(idx % 2 == 1) {
                str[i] = str[i].toLowerCase();
                idx++;
            }

            answer += str[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution05_self sol = new Solution05_self();
        String s = "try hello world";
        String answer = sol.solution(s);
        System.out.println(answer);
    }
}
