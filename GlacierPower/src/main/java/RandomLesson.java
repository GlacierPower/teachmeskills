import java.util.Arrays;
import java.util.Random;
public class RandomLesson {
    public static void main(String[] args) {
        int []massive=new int[10];

        for (int element =0;element<massive.length;element++){
            int randomNumber = new Random().nextInt(10);
            massive[element]+=randomNumber;
        }
        System.out.println(Arrays.toString(massive));
    }

}
