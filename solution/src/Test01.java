public class Test01 {


    public static void main(String[] args) {
        int month = 6;
        int day = 5;
        String answer = "";

        int[] date = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int daySum = 0;

        if (month == 1) {
            daySum = day + 98;
        } else {
            for (int i = 0; i < month-1; i++) {
                daySum += date[i];
            }
            daySum = daySum + day + 98;
        }

        int monNum = 0;

        for (int i = 0; i < date.length; i++) {
            daySum -= date[i];
                if (daySum < 0) {
                   daySum += date[i];
                   break;
                }
                monNum++;
        }
        int cnt = 0;
        if (monNum >= 12) {
            monNum = 0;
            for (int i = 0; i < date.length; i++) {
                daySum -= date[i];
                if (daySum < 0) {
                    daySum += date[i];
                    break;
                }
                monNum++;
            }
        }
        answer = (monNum+1) + "월 " + daySum + "일";

        System.out.println(answer);
    }
}