public class dodatkoweZad4 {
    public static void main(String[] args) {

        System.out.println(convertKilometersByMiles(33) + " Miles");
        System.out.println(convertKilogramsToPounds(4) + " £");
        System.out.println(convertLitersPerGallons(2) + " Gallons");
    }
    public static double convertKilometersByMiles(double km) {
        double miles = km * 0.621371192;
        return miles;
    }
    public static double convertKilogramsToPounds(double kg) {
        double pounds = kg * 2.20462262;
        return pounds;
    }
    public static double convertLitersPerGallons(double l) {
        double gallons = l * 0.264172052;
        return gallons;
    }
}
