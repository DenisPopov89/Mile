import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int amount = 5000;
        boolean bought = true;

        int mile;
        if (bought) {
            mile = 1;
        } else {
            mile = 0;
        }

        int bonus = amount / 20 * mile;

        if (bonus < 1) {
            bonus = 1;
        }

        System.out.println("количество миль:" + bonus);
    }
}