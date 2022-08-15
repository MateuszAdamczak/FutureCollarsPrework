public class dodatkoweZad3 {
    public static void main(String[] args) {
        System.out.println(dajNajwiekszaLiczbe(1112, 113, 6, 557));
    }

    public static int dajNajwiekszaLiczbe(int number1, int number2,
                                          int number3, int number4) {
        if (number1 > number2 & number1 > number3 & number1 > number4) {
            return number1;
        }
        if (number2 > number1 & number2 > number3 & number2 > number4) {
            return number2;
        }
        if (number3 > number1 & number3 > number2 & number3 > number4) {
            return number3;
        }
        return number4;
    }
}
