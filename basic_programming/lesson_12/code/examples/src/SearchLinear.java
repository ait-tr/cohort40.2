import java.util.Arrays;

public class SearchLinear {
    public static void main(String[] args) {
        int[] massif = {6, 44, 8, 2, 15, 56, 8, 7345, 64};
        int x = 8;

        boolean isInMassif = searchInArray(x, massif);
        System.out.println("isInMassif=" + isInMassif);

        int index = searchIndexOfArray(x, massif);
        System.out.println("index=" + index);

        int[] indexes = searchAllIndexesOfArray(x, massif);
        System.out.println("indexes=" + Arrays.toString(indexes));
    }

    public static boolean searchInArray(int target, int[] data) {
        for (int n: data) {
            if (n == target) {
                return true;
            }
        }
        return false;
    }

    public static int searchIndexOfArray(int target, int[] data) {
        for (int i = 0; i < data.length; i = i + 1) {
            if (data[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static int[] searchAllIndexesOfArray(int target, int[] data) {
        int[] result = new int[1];
        int currentResultIndex = 0;

        for (int i = 0; i < data.length; i = i + 1) {
            if (data[i] == target) {
                if (currentResultIndex >= result.length) {
                    result = Arrays.copyOf(result, result.length * 2);
                }
                result[currentResultIndex] = i;
                currentResultIndex += 1;
            }
        }

        return result;
    }
}
