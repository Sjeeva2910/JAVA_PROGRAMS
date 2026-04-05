class SalaryCalculator {

    public double average(int[] salary) {
        double max = salary[0];
        double min = salary[0];
        double sum = 0;

        for(int i = 0; i < salary.length; i++){
            sum += salary[i];

            if(salary[i] > max){
                max = salary[i];
            }

            if(salary[i] < min){
                min = salary[i];
            }
        }

        return (sum - max - min) / (salary.length - 2);
    }
}

public class Main {
    public static void main(String[] args) {

        int[] salary = {4000, 3000, 1000, 2000};

        SalaryCalculator sc = new SalaryCalculator(); // object create
        double result = sc.average(salary); // method call

        System.out.println("Average = " + result);
    }
}