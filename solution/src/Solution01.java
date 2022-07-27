public class Solution01 {
    public String solution(int a, int b) {
        // 1월 1일 = 금요일
        // 금요일부터 시작하는 날짜 배열 생성
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};

        // 윤년이라 2월이 29일이고 각 달마다의 날짜 수를 갖는 배열 생성 (총 12개, 31일을 넘어갈 수 없음)
        int[] date = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // 1월 1일부터 입력해준 날짜까지의 일수를 구할 sum 값
        int sum = 0;

        for (int i = 0; i < a - 1; i++) {
            // 5월 24일 이라면 date 배열에 있는 4월까지의 날짜 수를 for 문으로 더해주고
            sum += date[i];
        }
        // 5월의 24일을 추가로 더해줌 (1월 1일이 +1이 아니기 때문에 b 값에서 -1 해줌)
        sum += b - 1;

        // 총 일수를 day 배열의 개수인 7개를 돌아가며 반복하기 때문에 7로 나눈 나머지를
        // 인덱스로 넣어주면 날짜를 알 수 있음
        String answer = day[sum % 7];
        return answer;
    }

    public static void main(String[] args) {
        Solution01 sol = new Solution01();
        int a = 10;
        int b = 22;
        String answer = sol.solution(a, b);
        System.out.println(answer);
    }
}
