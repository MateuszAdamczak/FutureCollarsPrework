public class zad3 {
    public static void main(String[] args) {

        int[] numbers = new int[10];

        numbers[0] = 0;
        numbers[1] = 1;
        numbers[2] = 2;
        numbers[3] = 3;
        numbers[4] = 4;
        numbers[5] = 5;
        numbers[6] = 6;
        numbers[7] = 7;
        numbers[8] = 8;
        numbers[9] = 9;

        int sum = 0;
        for (int x : numbers) {
            sum += x;
        }
        System.out.println("Suma:" + sum);
    }
}
