import java.util.Arrays;

public class sortPaste {
    public static void main(String[] args) {
        int array[] ={1,5,-3,17,3,2,13};
        for (int i=0;i<array.length;i++){
            int current = array[i];
            int newValue = i-1;
            while (newValue>0&&current<array[newValue]){
                array[newValue+1] = array[newValue];
                newValue--;
            }
            array[newValue+1]=current;
            System.out.println(Arrays.toString(array));
        }
    }
}
