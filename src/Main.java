import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] numbers = {3.5, 5.55, -8.77, 67.7, 45.8, 7.2, 90.9, -5.6, 2.5, 1.6, 20.2, 1.22, 22.6, -2.4, 5.5};

        double counter = 0;

        int numberCounter = 0;

        boolean check = true;
        for (double present : numbers) {
            if (present < 0) {
                check = false;
            } else if (present > 0 && check) {
                counter += present;
                numberCounter++;
                System.out.println(present);
            }


        }
        System.out.println("Общее арифметическое число" + counter / numberCounter);

    }
    public static void selectionSort(int[] array) {

        for (int i = 0; i < array.length; i++) {

            int minimumElement = array[i];

            int indexOfMinimumElement = i;

            for (int j = i + 1; j < array.length; j++) {

                if (array[j] < minimumElement) {

                    minimumElement = array[j];

                    indexOfMinimumElement = j;

                }

            }

            int temporary = array[i];

            array[i] = minimumElement;

            array[indexOfMinimumElement] = temporary;
        }
        }
}