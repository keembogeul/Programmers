public class Test02 {
    public String solution(int n) {
        String answer = "";
        String[] arr = Integer.toString(n).split("");
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += Integer.parseInt(arr[i]);
        }

        for (int i = arr.length-1; i >= 0; i--) {
           answer += arr[i];
           if (i != 0) {
               answer += "+";
           }
        }
        answer = answer + "=" + sum;
        return answer;
    }

    public static void main(String[] args) {
        Test02 method = new Test02();
        System.out.println(method.solution(12345));
    }
}
