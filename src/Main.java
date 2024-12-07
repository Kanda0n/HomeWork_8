import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int[] arrayOfInt = new int[3];
        for (int i = 0; i < arrayOfInt.length; i++) {
            arrayOfInt[i] = i + 1;
        }
        double[] arrayOfDouble = {1.57, 7.654, 9.986};
        String[] arr = new String[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]="Элемент №"+(i+1);
        }

        System.out.println("Task 2");
        System.out.println(Arrays.toString(arrayOfInt));
        System.out.println(Arrays.toString(arrayOfDouble));
        System.out.println(Arrays.toString(arr));

        System.out.println("Task 3");
        for (int i = arrayOfInt.length - 1; i > 0; i--) {
            System.out.print(arrayOfInt[i]+", ");
        }
        System.out.println(arrayOfInt[0]);
        for (int i = arrayOfDouble.length - 1; i > 0; i--) {
            System.out.print(arrayOfDouble[i]+", ");
        }
        System.out.println(arrayOfDouble[0]);
        for (int i = arr.length - 1; i > 0; i--) {
            System.out.print(arr[i]+", ");
        }
        System.out.println(arr[0]);

        System.out.println("Task 4");
        for (int i = 0; i < arrayOfInt.length; i++) {
            if (arrayOfInt[i]%2 != 0) {
                arrayOfInt[i]+=1;
            }
        }
        System.out.println(Arrays.toString(arrayOfInt));
    }
}