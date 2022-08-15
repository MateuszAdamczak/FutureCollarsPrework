public class zad3 {
    public static void main(String[] args) {

        boolean isStudent = true;
        boolean isMan = true;
        System.out.println(canGetToClub(isStudent, isMan));

    }

    public static boolean canGetToClub(boolean isMan, boolean isStudent)
    {
        return isMan && isStudent;
    }
}
