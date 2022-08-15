public class zad2 {
    public static void main(String[] args) {

        System.out.println(printYearSeason(10));
    }

    public static String printYearSeason(int monthNumber) {
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                return ("ZIMA");
            case 3:
            case 4:
            case 5:
                return ("WIOSNA");
            case 6:
            case 7:
            case 8:
                return ("LATO");
            case 9:
            case 10:
            case 11:
                return ("JESIEŃ");
            default:
                return ("BŁĄD");
        }
    }
}
