public class zad4 {
    public static void main(String[] args) {

        System.out.println(sumEvenNumbers(0, 100));
        System.out.println(sumEvenNumbers(1783, 31825));
    }

    public static int sumEvenNumbers(int firstNumber, int secondNumber) {
        int sum = 0;
        if (firstNumber % 2 == 1) {
            ++firstNumber;
        } else {
            firstNumber += 2;
        }
        for (int i = firstNumber; i < secondNumber; i += 2) {
            sum += i;
        }
        return sum;
    }
}
