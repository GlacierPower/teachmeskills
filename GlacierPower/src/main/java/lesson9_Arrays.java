import java.util.Arrays;

public class lesson9_Arrays {
    public static void main(String[] args) {
        int[] array = new int[5];
        String[] array2 = new String[5];
        array2[0] = "Hi,";
        array2[1] = "How";
        array2[2] = "are";
        array2[3] = "you";
        array2[4] = "?";
        for (String s : array2) {
            System.out.println(s);
        }
        for (int j : array) {
            System.out.println(j);
        }
        String[] addNewData = new String[]{"How", "was", "your", ""};
        addNewData[3] = "day?";
        System.out.println(addNewData[3]);

        int[] intArray = new int[]{16, -17, 22, 0, 1, 33, 5, 4, 7};
        for (int i = 0; i <= intArray.length - 1; i++) {
            System.out.print(intArray[i] + " ");
        }
        Arrays.sort(intArray);
        System.out.println("\n");
        for (int i = 0; i <= intArray.length - 1; i++) {
            System.out.print(intArray[i] + " ");
        }

        System.out.println();
        int index = Arrays.binarySearch(intArray, 33);// only when array was sorted
        System.out.println(index);

        System.out.println(Arrays.toString(intArray));// when you want to know values

    }
}