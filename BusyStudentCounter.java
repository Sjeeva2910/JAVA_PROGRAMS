class BusyStudentCounter {

    public int countBusyStudents(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;

        for(int i = 0; i < startTime.length; i++){
            if(startTime[i] <= queryTime && queryTime <= endTime[i]){
                count++;
            }
        }

        return count;
    }
}

public class Main {
    public static void main(String[] args) {

        BusyStudentCounter obj = new BusyStudentCounter();

        int[] startTime = {1, 2, 3};
        int[] endTime   = {3, 2, 7};
        int queryTime = 4;

        int result = obj.countBusyStudents(startTime, endTime, queryTime);

        System.out.println("Busy students count: " + result);
    }
}