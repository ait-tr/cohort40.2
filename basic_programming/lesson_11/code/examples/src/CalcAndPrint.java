public class CalcAndPrint {
    public static void main(String[] args) {
        int a = 1;
        int resultA = calc(a);
        System.out.println(a + " ^ 3 = " + resultA);

        int b = 2;
        int resultB = calc(b);
        System.out.println(b + " ^ 3 = " + resultB);
    }

    public static int calc(int myBestNumber) {
        int result = myBestNumber * myBestNumber * myBestNumber;
        return result;
    }
}
