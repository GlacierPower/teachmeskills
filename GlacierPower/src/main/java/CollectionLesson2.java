import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionLesson2 {
    public static void main(String[] args) {
        Object[] number = {3, 1, 4, 6, 2, 5, 7, 9, 8};

        List arrayList = new ArrayList(Arrays.asList(number));
        Collections.sort(arrayList);
        Collections.reverse(arrayList);//reverse sort
        arrayList.toArray();

        for (int value = 0; value < arrayList.size(); value++) {
            System.out.print(arrayList.get(value) + " ");
        }

    }
}
