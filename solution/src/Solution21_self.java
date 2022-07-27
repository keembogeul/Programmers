public class Solution21_self {
    public int solution(int[] nums) {
        int answer = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    sum = nums[i] + nums[j] + nums[k];

                    if (isPrime(sum)) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    private boolean isPrime(int num) {
        //i=1부터가 아닌 이유는 1은 나눌 필요 없는 수이므로
        //나누어 떨어지면 소수가 아니므로 false
        for (int i = 2; i < num; i++){
            if (num%i == 0)
                return false;
        }
        //나누어 떨어지지 않으면 true
        return true;
    }

    public static void main(String[] args) {
        Solution21_self sol = new Solution21_self();
        int[] nums = {1,2,7,6,4};
        int answer = sol.solution(nums);
        System.out.println(answer);
    }
}
