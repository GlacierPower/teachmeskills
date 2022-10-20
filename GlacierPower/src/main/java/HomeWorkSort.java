import java.util.Arrays;

public class HomeWorkSort {
    public static void main(String[] args) {
        int[][] numbers = {{3,1,4},{2,7,9},{8,5,6}};
        for (int[] number1D:numbers){
            Arrays.sort(number1D);
            for (int number:number1D){
                System.out.print(number+" ");
            }
        }
        System.out.println();
        for (int[] number1D:numbers){
            for(int number=0;number<=number1D.length;number++){
                System.out.print(number1D[number1D.length-1]-number+" ");
                //пофиксить этот код
            }
        }
    }

}
