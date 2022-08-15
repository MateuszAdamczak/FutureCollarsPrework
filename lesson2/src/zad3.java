public class zad3 {
    public static void main(String[] args) {

        String namePerson = "Adam Nowak"; // imie i nazwisko osoby
        String idPerson = "950214512"; // pesel osoby
        String nameMedicine = "APAP"; //nazwa leku

        float dosagePerson = 1.5F; //porcja
        double dosageHours = 3; //godziny dawkowania
        double priceMedicine = 19.99d; //cena leku

        System.out.println("Imię i nazwisko: " + namePerson + ","
                + " Pesel: " + idPerson + ","
                + " Nazwa leku: " + nameMedicine + ","
                + " Dawkowanie " + dosagePerson + "/" + dosageHours + "h" + ","
                + " Cena = " + priceMedicine + "zł");
    }
}
