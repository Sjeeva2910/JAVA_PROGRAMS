import java.util.Stack;

public class DailyTemperatures {

    public static int[] dailyTemperatures(int[] temperatures) {

        int[] answer = new int[temperatures.length];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {

            while (!stack.isEmpty() &&
                   temperatures[i] > temperatures[stack.peek()]) {

                int oldDay = stack.pop();

                answer[oldDay] = i - oldDay;
            }

            stack.push(i);
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};

        int[] answer = dailyTemperatures(temperatures);

        System.out.print("Answer: ");

        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
    }
}