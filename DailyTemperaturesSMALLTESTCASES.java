public class DailyTemperaturesSMALLTESTCASES {

    public static int[] dailyTemperatures(int[] temperatures) {

        int[] answer = new int[temperatures.length];

        int day = 0;

        while (day < temperatures.length) {

            int count = 1;

            for (int i = day; i < temperatures.length - 1; i++) {

                if (temperatures[day] < temperatures[i + 1]) {
                    answer[day] = count;
                    break;
                }

                count++;
            }

            day++;
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};

        int[] answer = dailyTemperatures(temperatures);

        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
    }
}