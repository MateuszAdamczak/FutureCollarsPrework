public class dodatkoweZad3 {
    public static void main(String[] args) {

        System.out.println(calculateVelocity(1000,360));
        System.out.println(calculateVelocity(1500000,86400));
        System.out.println(calculateVelocity(1500000,36000));
    }

    public static double calculateVelocity(double way, double time) {
        double velocity = way / time;
        return velocity;

//    Zaimplementuj metodę obliczającą prędkość w ruchu jednostajnym prostoliniowym,
//    zgodnie ze wzorem
//    V = s/t, gdzie V- prędkość, t- czas, s - droga.
//    Uruchom metodę dla 3 dowolnych par parametrów s i t.
//    Domyślnie przyjmij jednostkę: metr i sekunda odpowiednio dla parametrów s oraz t
    }
}
