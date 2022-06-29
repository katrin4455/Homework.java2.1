public class Main {

    public static void main(String[] args) {
        int bill = 100;

        int payment = 800;

        int bonus;

        if (payment >= 1000) {

            bonus = payment / 100;
        } else {
            bonus = 0;
        }
        int finishPayment = payment + bonus;

        bill = bill + finishPayment;

        System.out.println("Баланс: " + bill);
    }


}
