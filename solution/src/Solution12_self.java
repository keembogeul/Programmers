public class Solution12_self {
    public boolean solution(int n) {
        boolean answer = true;

        // n 값을 문자열로 변환하고 한글자씩 쪼개 배열에 넣어줌
        String[] arr = Integer.toString(n).split("");
        // n 값의 자릿수의 합을 구할 변수 선언
        int sum = 0;

        // n의 자릿수 만큼 for 문을 돌며 정수로 변환한 배열의 요소들을 sum 에 차례로 더해줌
        for(int i = 0; i < arr.length; i++) {
            sum += Integer.parseInt(arr[i]);
        }

        // n 값이 자릿수의 합으로 나누어 떨어지면 true 리턴
        if(n%sum == 0) {
            answer = true;
            // 그렇지 않으면 false 리턴
        } else {
            answer = false;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution12_self sol = new Solution12_self();
        int n = 12;
        boolean answer = sol.solution(n);
        System.out.println(answer);
    }

}
