public class Main {
    public static void main(String[] args) {
        int amount = 13676;
        int bonus = amount / 20;

        if (bonus < 1) {
            bonus = 1;
        }

        System.out.println("количество миль:" + bonus);
    }
}