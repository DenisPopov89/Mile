public class Main {
    public static void main(String[] args) {
        int amount = 5000;
        int bonus = amount / 20 * 1;

        if (bonus < 1) {
            bonus = 1;
        }

        System.out.println("количество миль:" + bonus);
    }
}