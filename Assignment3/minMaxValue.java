// Question no. 2
public class minMaxValue{
    public static void main(String[] args){
        int[] Array = {1, 2, 3, 4, 5};
        int min = Array[0];
        int max = Array[0];
        for (int i = 1; i < Array.length; i++) {
            if (Array[i] < min) {
                min = Array[i];
            }
            if (Array[i] > max) {
                max = Array[i];
            }
        }
        System.out.println("The minimum value is " + min);
        System.out.println("The maximum value is " + max);
    }
}