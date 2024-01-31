import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] massif = {6, 44, 8, 2, 15, 56, 8, 7345, 64, 12};
        sortArray(massif);
        System.out.println(Arrays.toString(massif));
    }

    public static void sortArray(int[] data) {
        int minIndex;

        for (int i = 0; i < data.length; i++) {
            minIndex = -1;

            for (int j = i + 1; j < data.length; j++) {
                if (minIndex == -1 || data[minIndex] >= data[j])
                    minIndex = j;
            }

            if (minIndex != -1 && data[minIndex] < data[i]) {
                int temp = data[i];
                data[i] = data[minIndex];
                data[minIndex] = temp;
            }
        }
    }
}
