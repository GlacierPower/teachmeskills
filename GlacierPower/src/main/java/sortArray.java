import java.util.Arrays;

public class sortArray {
    public static void main(String[] args) {
        int array[] = {1, 5, -3, 17, 3, 2, 13};
        boolean isSorted = false;
        int buffer;

        while (isSorted == false) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    isSorted = false;

                    buffer = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buffer;
                }

            }
            System.out.println(Arrays.toString(array));
        }

    }
}
