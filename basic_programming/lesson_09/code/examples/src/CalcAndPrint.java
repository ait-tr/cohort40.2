public class CalcAndPrint {
    public static void main(String[] args) {
        int a = 1;
        calcAndPrint(a);

        int b = 2;
        calcAndPrint(b);
    }

    public static void calcAndPrint(int myBestNumber) {
        int result = myBestNumber * myBestNumber * myBestNumber;
        System.out.println(myBestNumber + " ^ 3 = " + result);
    }
}
