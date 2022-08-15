public class zad1 {
    public static void main(String[] args) {

        System.out.println(getDescriptionTemperature(40));
    }

    public static String getDescriptionTemperature(int temperatureValue) {
        String result;
        if (temperatureValue > 35 && temperatureValue <= 37) {
            result = "Temperatura w normie";
        } else if (temperatureValue > 37 && temperatureValue <= 38.5) {
            result = "Stan podgorączkowy";
        } else if (temperatureValue > 38.5 && temperatureValue <= 40) {
            result = "Gorączka";
        } else if (temperatureValue > 40 && temperatureValue <= 41) {
            result = "Dwoń na pogotowie";
        } else {
            result = "Błąd pomiarowy";
        }
        return result;
    }
//    public static String temperatureClass(int temperatureValue) {
//        if (temperatureValue > 35 && temperatureValue <= 37) {
//            return "Temperatura w normie";
//        } else if (temperatureValue > 37 && temperatureValue <= 38.5) {
//            return "Stan podgorączkowy";
//        } else if (temperatureValue > 38.5 && temperatureValue <= 40) {
//            return "Gorączka";
//        } else if (temperatureValue > 40 && temperatureValue <= 41) {
//            return "Dwoń na pogotowie";
//        } else {
//            return "Błąd pomiarowy";
//        }
}
