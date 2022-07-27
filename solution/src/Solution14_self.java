public class Solution14_self {
    public int solution(int[][] sizes) {
        int answer = 0;
        // 왼쪽에 큰 값을 넣어주기 위해 sort 과정에서 임시로 값을 넣어줄 변수
        int temp = 0;
        int maxWidth = 0;   // 큰 값 중 가장 큰 값
        int maxHeight = 0;  // 작은 값 중 가장 큰 값

        // sizes 의 길이(명함의 개수)만큼 for 문 돌려줌
        for (int i = 0; i < sizes.length; i++) {
            // sizes 배열에서 앞의 인덱스에 큰 값이 오도록
            if (sizes[i][0] < sizes[i][1]) {
                temp = sizes[i][1];
                sizes[i][1] = sizes[i][0];
                sizes[i][0] = temp;
            }
            // 위에서 선언해둔 max 값과 큰 값을 몰아준 앞의 인덱스의 값을 비교
            // 제일 마지막에 들어가있는 값이 최댓값
            if (maxWidth < sizes[i][0]) {
                maxWidth = sizes[i][0];
            }
            // 작은 값을 몰아준 뒤의 인덱스의 값을 비교
            // 제일 마지막에 들어가있는 값이 최댓값
            if (maxHeight < sizes[i][1]) {
                maxHeight = sizes[i][1];
            }
            // 가로 * 세로
            answer = maxWidth * maxHeight;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution14_self sol = new Solution14_self();
        int[][] sizes = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};
        int answer = sol.solution(sizes);
        System.out.println(answer);
    }
}
