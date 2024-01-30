public class CalcAndPrint {
    public static void main(String[] args) {
        int a = 1;
        int resultA = calcAndPrint(a);
        System.out.println(a + " ^ 3 = " + resultA);

        int b = 2;
        int resultB = calcAndPrint(b);
        System.out.println(b + " ^ 3 = " + resultB);
    }

    public static int calcAndPrint(int myBestNumber) {
        int result = myBestNumber * myBestNumber * myBestNumber;
        return result;
    }
}
