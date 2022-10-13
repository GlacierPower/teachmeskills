import java.util.Arrays;
import java.util.OptionalInt;

public class CountArray {
    public static void main(String[] args) {
        int[] temp = new int[]{16, -17, 22, 0, 1, 33, 5, 4, -7};
        double averageTemp;
        int sumOfTemp = 0;
        for (int i = 0; i < temp.length; i++) {
            sumOfTemp += temp[i];//add current value
        }
        averageTemp = (double) sumOfTemp / temp.length;
        System.out.println(averageTemp);

        int[] mas = {25, 47, 34, 18, 96, 33, 28, 55, 87, 13};
        Arrays.sort(mas);

        int minValue = 0;
        int maxValue = 0;
        minValue =mas[0];//min and max first, this is better than second
        maxValue=mas[mas.length-1];
        System.out.println("Min: "+minValue+ " Max: "+maxValue);

        OptionalInt max = Arrays.stream(mas).max();// min and max second
        OptionalInt min = Arrays.stream(mas).min();
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
