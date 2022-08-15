public class zad5 {
    public static void main(String[] args) {

        String[] names1 = {"Katarzyna", "Adam", "Andrzej",
                "Monika", "Bogdan", "Krystyna",
                "Piotr", "Paweł", "Joanna", "Igor"};

        int counter = 1;

        for (String x : names1) {
            System.out.println(counter++ + ". " + x);
        }

//        String[] studentsName = {"Katarzyna", "Adam", "Andrzej",
//                "Monika", "Bogdan", "Krystyna",
//                "Piotr", "Paweł", "Joanna", "Igor"};
//
//        int[] studentNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//
//        for (String x : studentsName){
//            for (int y : studentNumbers)
//            System.out.println( y ++ ". " + x );
    }
}
