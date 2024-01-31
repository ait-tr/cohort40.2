public class BinarySearch {
    public static void main(String[] args) {
        int x = 8;
        int[] massif = {2, 6, 8, 8, 15, 44, 56, 64, 234, 7345};
        int index = getIndexOfArray(x, massif);
        System.out.println("index=" + index);
    }

    public static int getIndexOfArray(int target, int[] data) {
        int L, R, M;

        L = 0;
        R = data.length - 1;

        do {
            M = L + (R - L) / 2;

            if (data[M] == target)
                return M;

            if (data[M] < target)
                L = M + 1;
            else if (data[M] > target)
                R = M - 1;
        } while(!(M == L && L == R));

        return -1;
    }
}
